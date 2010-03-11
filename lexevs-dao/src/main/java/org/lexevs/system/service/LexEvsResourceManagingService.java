/*
 * Copyright: (c) 2004-2009 Mayo Foundation for Medical Education and 
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 *
 * Except as contained in the copyright notice above, or as used to identify 
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
 * 
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 * 		http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package org.lexevs.system.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference;
import org.LexGrid.LexBIG.DataModel.Core.types.CodingSchemeVersionStatus;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.codingSchemes.CodingScheme;
import org.LexGrid.util.sql.lgTables.SQLTableConstants;
import org.lexevs.cache.annotation.CacheMethod;
import org.lexevs.cache.annotation.Cacheable;
import org.lexevs.cache.annotation.ClearCache;
import org.lexevs.dao.database.operation.LexEvsDatabaseOperations;
import org.lexevs.dao.database.prefix.PrefixResolver;
import org.lexevs.dao.database.service.DatabaseServiceManager;
import org.lexevs.dao.index.service.entity.EntityIndexService;
import org.lexevs.logging.LoggingBean;
import org.lexevs.registry.model.RegistryEntry;
import org.lexevs.registry.service.Registry;
import org.lexevs.registry.service.Registry.ResourceType;
import org.lexevs.registry.utility.RegistryUtility;
import org.lexevs.system.constants.SystemVariables;
import org.lexevs.system.utility.MyClassLoader;
import org.springframework.beans.factory.InitializingBean;

/**
 * The Class LexEvsResourceManagingService.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
@Cacheable(cacheName = "DelegatingResourceManagingService")
public class LexEvsResourceManagingService extends LoggingBean implements SystemResourceService, InitializingBean {

	/** The registry. */
	private Registry registry;
	
	/** The prefix resolver. */
	private PrefixResolver prefixResolver;
	
	/** The lex evs database operations. */
	private LexEvsDatabaseOperations lexEvsDatabaseOperations;
	
	/** The system variables. */
	private SystemVariables systemVariables;
	
	/** The entity index service. */
	private EntityIndexService entityIndexService;
	
	/** The my class loader. */
	private MyClassLoader myClassLoader;
	
	/** The database service manager. */
	private DatabaseServiceManager databaseServiceManager;

	/** The alias holder. */
	private List<CodingSchemeAliasHolder> aliasHolder = new ArrayList<CodingSchemeAliasHolder>();

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
		readCodingSchemeAliasesFromServer();
	}
	
	/**
	 * Read coding scheme aliases from server.
	 */
	protected void readCodingSchemeAliasesFromServer(){
		aliasHolder.clear();
		List<RegistryEntry> entries = registry.getAllRegistryEntriesOfType(ResourceType.CODING_SCHEME);
		for(RegistryEntry entry : entries){

			CodingScheme codingScheme = databaseServiceManager.getCodingSchemeService().getCodingSchemeByUriAndVersion(
					entry.getResourceUri(), 
					entry.getResourceVersion());
			aliasHolder.add(
					this.codingSchemeToAliasHolder(codingScheme));
		}
	}
	
	/**
	 * Coding scheme to alias holder.
	 * 
	 * @param codingScheme the coding scheme
	 * 
	 * @return the coding scheme alias holder
	 */
	public CodingSchemeAliasHolder codingSchemeToAliasHolder(CodingScheme codingScheme){
		CodingSchemeAliasHolder aliasHolder = new CodingSchemeAliasHolder();
		aliasHolder.setCodingSchemeName(codingScheme.getCodingSchemeName());
		aliasHolder.setCodingSchemeUri(codingScheme.getCodingSchemeURI());
		aliasHolder.setLocalNames(Arrays.asList(codingScheme.getLocalName()));
		aliasHolder.setRepresentsVersion(codingScheme.getRepresentsVersion());
		aliasHolder.setFormalName(codingScheme.getFormalName());
		
		return aliasHolder;
	}

	
	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#createNewTablesForLoad()
	 */
	public String createNewTablesForLoad() {
		String prefix;
		if( isSingleTableMode() ){
			this.getLogger().info("In single-table mode -- not creating a new set of tables.");
			prefix = prefixResolver.resolveDefaultPrefix();
		} else {
			this.getLogger().info("In multi-table mode -- creating a new set of tables.");
			prefix = prefixResolver.getNextCodingSchemePrefix();
		}

		return prefix;
	}
	
	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#removeCodingSchemeResourceFromSystem(java.lang.String, java.lang.String)
	 */
	@ClearCache
	public void removeCodingSchemeResourceFromSystem(String uri, String version) throws LBParameterException {
		AbsoluteCodingSchemeVersionReference ref = new AbsoluteCodingSchemeVersionReference();
		ref.setCodingSchemeURN(uri);
		ref.setCodingSchemeVersion(version);

		if(! isSingleTableMode() ){
			lexEvsDatabaseOperations.dropTables(uri, version);
		} else {
			this.databaseServiceManager.getCodingSchemeService().destroyCodingScheme(uri, version);
		}
		
		RegistryEntry entry = registry.getCodingSchemeEntry(ref);
		this.registry.removeEntry(entry);
		entityIndexService.dropIndex(ref);
		this.readCodingSchemeAliasesFromServer();
	}

	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#removeNonCodingSchemeResourceFromSystem(java.lang.String)
	 */
	@ClearCache
	public void removeNonCodingSchemeResourceFromSystem(String uri) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#getInternalCodingSchemeNameForUserCodingSchemeName(java.lang.String, java.lang.String)
	 */
	@CacheMethod
	public String getInternalCodingSchemeNameForUserCodingSchemeName(
			 String codingSchemeName, String version) throws LBParameterException {
		for(CodingSchemeAliasHolder alias : this.aliasHolder){
			if(alias.getRepresentsVersion().equals(version)){
				if( hasAlias(alias, codingSchemeName)){
					return alias.getCodingSchemeName();
				}
			}
		}
		 throw new LBParameterException("No coding scheme could be located for the values you provided",
                 SQLTableConstants.TBLCOL_CODINGSCHEMENAME + ", " + SQLTableConstants.TBLCOL_VERSION,
                 codingSchemeName + ", " + version);
	}
	
	/**
	 * Gets the uri for user coding scheme name.
	 * 
	 * @param codingSchemeName the coding scheme name
	 * @param version the version
	 * 
	 * @return the uri for user coding scheme name
	 * 
	 * @throws LBParameterException the LB parameter exception
	 */
	public String getUriForUserCodingSchemeName(
			String codingSchemeName, String version) throws LBParameterException {
		for(CodingSchemeAliasHolder alias : this.aliasHolder){
			if(alias.getRepresentsVersion().equals(version)){
				if( hasAlias(alias, codingSchemeName)){
					return alias.getCodingSchemeUri();
				}
			}
		}
		 throw new LBParameterException("No coding scheme could be located for the values you provided",
                 SQLTableConstants.TBLCOL_CODINGSCHEMENAME + ", " + SQLTableConstants.TBLCOL_VERSION,
                 codingSchemeName + ", " + version);
	}
	
	/**
	 * Checks for alias.
	 * 
	 * @param holder the holder
	 * @param alias the alias
	 * 
	 * @return true, if successful
	 */
	protected boolean hasAlias(CodingSchemeAliasHolder holder, String alias){
		return holder.getCodingSchemeName().equals(alias) ||
			holder.getCodingSchemeUri().equals(alias) ||
			( holder.getFormalName() != null && holder.getFormalName().equals(alias) ) ||
			( holder.getLocalNames() != null && holder.getLocalNames().contains(alias) );	
	}
	
	/**
	 * Gets the uri for coding scheme name.
	 * 
	 * @param codingSchemeName the coding scheme name
	 * 
	 * @return the uri for coding scheme name
	 */
	protected List<String> getUriForCodingSchemeName(String codingSchemeName){
		List<String> returnList = new ArrayList<String>();

		for(CodingSchemeAliasHolder alias : this.aliasHolder){
			if( hasAlias(alias, codingSchemeName)){
				returnList.add(alias.getCodingSchemeUri());
			}
		}
		return returnList;
	}
	
	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#getUriForUserCodingSchemeName(java.lang.String)
	 */
	public String getUriForUserCodingSchemeName(String codingSchemeName)
	throws LBParameterException {
			List<String> uris = getUriForCodingSchemeName(codingSchemeName);
			if(uris == null || uris.size() == 0){
				throw new LBParameterException("No URI found for Coding Scheme Name: " + codingSchemeName);
			}
			
			String uri = uris.get(0);
			for(int i=1;i<uris.size();i++){
				if(! uris.get(i).equals(uri)){
					throw new LBParameterException("Found multiple URIs for Coding Scheme Name: " + codingSchemeName);
				}
			}
			return uri;
	}

	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#getInternalVersionStringForTag(java.lang.String, java.lang.String)
	 */
	@CacheMethod
	public String getInternalVersionStringForTag(String codingSchemeName,
			String tag) throws LBParameterException {
		
		List<String> uris = getUriForCodingSchemeName(codingSchemeName);
		
		List<RegistryEntry> foundEntries = new ArrayList<RegistryEntry>();
		for(String uri : uris){
			List<RegistryEntry> entries = this.registry.getEntriesForUri(uri);
			
			for(RegistryEntry entry : entries){
				foundEntries.add(entry);
			}
		}
		
		if(foundEntries.size() > 1){
			
			List<RegistryEntry> taggedEntries = getTaggedEntries(foundEntries, tag);
			if(taggedEntries.size() == 0){
				 throw new LBParameterException("No Coding Schemes were found for the values you provided: ",
		                 SQLTableConstants.TBLCOL_CODINGSCHEMENAME + ", " + SQLTableConstants.TBLCOL_VERSION,
		                 codingSchemeName + ", " + tag);
			}
			
			if(taggedEntries.size() > 1){
				 throw new LBParameterException("Multiple Coding Schemes were found for the values you provided: ",
		                 SQLTableConstants.TBLCOL_CODINGSCHEMENAME + ", " + SQLTableConstants.TBLCOL_VERSION,
		                 codingSchemeName + ", " + tag);
			}
			
			return taggedEntries.get(0).getResourceVersion();
		}
		
		if(foundEntries.size() == 1){
			RegistryEntry entry = foundEntries.get(0);
			if(entry.getTag().equals(tag)){
				return entry.getResourceVersion();
			}
		}
		
		 throw new LBParameterException("No coding scheme could be located for the values you provided",
                 SQLTableConstants.TBLCOL_CODINGSCHEMENAME + ", " + SQLTableConstants.TBLCOL_VERSION,
                 codingSchemeName + ", " + tag);
	}

	/**
	 * Gets the tagged entries.
	 * 
	 * @param entries the entries
	 * @param tag the tag
	 * 
	 * @return the tagged entries
	 */
	protected List<RegistryEntry> getTaggedEntries(List<RegistryEntry> entries, String tag){
		List<RegistryEntry> foundEntries = new ArrayList<RegistryEntry>();
		for(RegistryEntry entry : foundEntries){
			if(entry.getTag().equals(tag)){
				foundEntries.add(entry);
			}
		}
		return foundEntries;
	}

	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#containsNonCodingSchemeResource(java.lang.String)
	 */
	public boolean containsNonCodingSchemeResource(String uri)
	throws LBParameterException {
		return registry.containsNonCodingSchemeEntry(uri);
	}

	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#containsCodingSchemeResource(java.lang.String, java.lang.String)
	 */
	public boolean containsCodingSchemeResource(String uri, String version)
	throws LBParameterException {
		AbsoluteCodingSchemeVersionReference ref = new AbsoluteCodingSchemeVersionReference();
		ref.setCodingSchemeURN(uri);
		ref.setCodingSchemeVersion(version);
		
		return registry.containsCodingSchemeEntry(ref);
	}
	
	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#updateCodingSchemeResourceTag(org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference, java.lang.String)
	 */
	@ClearCache
	public void updateCodingSchemeResourceTag(
			AbsoluteCodingSchemeVersionReference codingScheme, String newTag)
			throws LBParameterException {
		RegistryEntry entry = registry.getCodingSchemeEntry(codingScheme);
		entry.setTag(newTag);
		registry.updateEntry(entry);
		this.readCodingSchemeAliasesFromServer();
		
	}

	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#updateCodingSchemeResourceStatus(org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference, org.LexGrid.LexBIG.DataModel.Core.types.CodingSchemeVersionStatus)
	 */
	@ClearCache
	public void updateCodingSchemeResourceStatus(
			AbsoluteCodingSchemeVersionReference codingScheme,
			CodingSchemeVersionStatus status) throws LBParameterException {

		RegistryEntry entry = registry.getCodingSchemeEntry(codingScheme);
		entry.setStatus(status.toString());
		registry.updateEntry(entry);
		this.readCodingSchemeAliasesFromServer();
	}

	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#updateNonCodingSchemeResourceStatus(java.lang.String, org.LexGrid.LexBIG.DataModel.Core.types.CodingSchemeVersionStatus)
	 */
	@ClearCache
	public void updateNonCodingSchemeResourceStatus(String uri,
			CodingSchemeVersionStatus status) throws LBParameterException {
		RegistryEntry entry = registry.getNonCodingSchemeEntry(uri);
		entry.setStatus(status.toString());
		registry.updateEntry(entry);
		this.readCodingSchemeAliasesFromServer();
	}

	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#updateNonCodingSchemeResourceTag(java.lang.String, java.lang.String)
	 */
	@ClearCache
	public void updateNonCodingSchemeResourceTag(String uri, String newTag)
			throws LBParameterException {
		RegistryEntry entry = registry.getNonCodingSchemeEntry(uri);
		entry.setTag(newTag);
		registry.updateEntry(entry);
		this.readCodingSchemeAliasesFromServer();
	}
	
	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#addCodingSchemeResourceToSystem(java.lang.String, java.lang.String)
	 */
	@ClearCache
	public void addCodingSchemeResourceToSystem(String uri, String version)
			throws LBParameterException {
		RegistryEntry entry = RegistryUtility.codingSchemeToRegistryEntry(uri, version);
		entry.setStatus(CodingSchemeVersionStatus.PENDING.toString());
		try {
			this.getRegistry().addNewItem(entry);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		this.readCodingSchemeAliasesFromServer();
	}
	
	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#addCodingSchemeResourceToSystem(org.LexGrid.codingSchemes.CodingScheme)
	 */
	@ClearCache
	public void addCodingSchemeResourceToSystem(CodingScheme codingScheme)
			throws LBParameterException {
		RegistryEntry entry = RegistryUtility.codingSchemeToRegistryEntry(codingScheme);
		entry.setStatus(CodingSchemeVersionStatus.PENDING.toString());
		try {
			this.getRegistry().addNewItem(entry);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	
		this.aliasHolder.add(this.codingSchemeToAliasHolder(codingScheme));
	}

	/**
	 * Checks if is single table mode.
	 * 
	 * @return true, if is single table mode
	 */
	protected boolean isSingleTableMode(){
		return systemVariables.isSingleTableMode();
	}

	/* (non-Javadoc)
	 * @see org.lexevs.system.service.SystemResourceService#getClassLoader()
	 */
	public MyClassLoader getClassLoader() {
		return this.myClassLoader;
	}

	/**
	 * Gets the registry.
	 * 
	 * @return the registry
	 */
	public Registry getRegistry() {
		return registry;
	}

	/**
	 * Sets the registry.
	 * 
	 * @param registry the new registry
	 */
	public void setRegistry(Registry registry) {
		this.registry = registry;
	}

	/**
	 * Gets the prefix resolver.
	 * 
	 * @return the prefix resolver
	 */
	public PrefixResolver getPrefixResolver() {
		return prefixResolver;
	}

	/**
	 * Sets the prefix resolver.
	 * 
	 * @param prefixResolver the new prefix resolver
	 */
	public void setPrefixResolver(PrefixResolver prefixResolver) {
		this.prefixResolver = prefixResolver;
	}

	/**
	 * Gets the lex evs database operations.
	 * 
	 * @return the lex evs database operations
	 */
	public LexEvsDatabaseOperations getLexEvsDatabaseOperations() {
		return lexEvsDatabaseOperations;
	}

	/**
	 * Sets the lex evs database operations.
	 * 
	 * @param lexEvsDatabaseOperations the new lex evs database operations
	 */
	public void setLexEvsDatabaseOperations(
			LexEvsDatabaseOperations lexEvsDatabaseOperations) {
		this.lexEvsDatabaseOperations = lexEvsDatabaseOperations;
	}

	/**
	 * Gets the system variables.
	 * 
	 * @return the system variables
	 */
	public SystemVariables getSystemVariables() {
		return systemVariables;
	}

	/**
	 * Sets the system variables.
	 * 
	 * @param systemVariables the new system variables
	 */
	public void setSystemVariables(SystemVariables systemVariables) {
		this.systemVariables = systemVariables;
	}

	/**
	 * Sets the my class loader.
	 * 
	 * @param myClassLoader the new my class loader
	 */
	public void setMyClassLoader(MyClassLoader myClassLoader) {
		this.myClassLoader = myClassLoader;
	}
	
	/**
	 * Sets the entity index service.
	 * 
	 * @param entityIndexService the new entity index service
	 */
	public void setEntityIndexService(EntityIndexService entityIndexService) {
		this.entityIndexService = entityIndexService;
	}

	/**
	 * Gets the entity index service.
	 * 
	 * @return the entity index service
	 */
	public EntityIndexService getEntityIndexService() {
		return entityIndexService;
	}

	/**
	 * Sets the database service manager.
	 * 
	 * @param databaseServiceManager the new database service manager
	 */
	public void setDatabaseServiceManager(DatabaseServiceManager databaseServiceManager) {
		this.databaseServiceManager = databaseServiceManager;
	}

	/**
	 * Gets the database service manager.
	 * 
	 * @return the database service manager
	 */
	public DatabaseServiceManager getDatabaseServiceManager() {
		return databaseServiceManager;
	}

	/**
	 * The Class CodingSchemeAliasHolder.
	 * 
	 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
	 */
	protected static class CodingSchemeAliasHolder {
		
		/** The coding scheme name. */
		private String codingSchemeName;
		
		/** The coding scheme uri. */
		private String codingSchemeUri;
		
		/** The represents version. */
		private String representsVersion;
		
		/** The formal name. */
		private String formalName;
		
		/** The local names. */
		private List<String> localNames = new ArrayList<String>();
		
		/**
		 * Gets the coding scheme name.
		 * 
		 * @return the coding scheme name
		 */
		public String getCodingSchemeName() {
			return codingSchemeName;
		}
		
		/**
		 * Sets the coding scheme name.
		 * 
		 * @param codingSchemeName the new coding scheme name
		 */
		public void setCodingSchemeName(String codingSchemeName) {
			this.codingSchemeName = codingSchemeName;
		}
		
		/**
		 * Gets the coding scheme uri.
		 * 
		 * @return the coding scheme uri
		 */
		public String getCodingSchemeUri() {
			return codingSchemeUri;
		}
		
		/**
		 * Sets the coding scheme uri.
		 * 
		 * @param codingSchemeUri the new coding scheme uri
		 */
		public void setCodingSchemeUri(String codingSchemeUri) {
			this.codingSchemeUri = codingSchemeUri;
		}
		
		/**
		 * Gets the represents version.
		 * 
		 * @return the represents version
		 */
		public String getRepresentsVersion() {
			return representsVersion;
		}
		
		/**
		 * Sets the represents version.
		 * 
		 * @param representsVersion the new represents version
		 */
		public void setRepresentsVersion(String representsVersion) {
			this.representsVersion = representsVersion;
		}
		
		/**
		 * Gets the formal name.
		 * 
		 * @return the formal name
		 */
		public String getFormalName() {
			return formalName;
		}
		
		/**
		 * Sets the formal name.
		 * 
		 * @param formalName the new formal name
		 */
		public void setFormalName(String formalName) {
			this.formalName = formalName;
		}
		
		/**
		 * Gets the local names.
		 * 
		 * @return the local names
		 */
		public List<String> getLocalNames() {
			return localNames;
		}
		
		/**
		 * Sets the local names.
		 * 
		 * @param localNames the new local names
		 */
		public void setLocalNames(List<String> localNames) {
			this.localNames = localNames;
		}
	}
}
