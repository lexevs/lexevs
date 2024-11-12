package org.lexevs.dao.database.ibatis.registry;



import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.lexevs.dao.database.access.registry.RegistryDao;
import org.lexevs.dao.database.ibatis.AbstractIbatisDao;
import org.lexevs.dao.database.ibatis.parameter.PrefixedParameter;
import org.lexevs.dao.database.ibatis.parameter.PrefixedParameterCollection;
import org.lexevs.dao.database.ibatis.parameter.PrefixedParameterTriple;
import org.lexevs.dao.database.ibatis.parameter.PrefixedParameterTuple;
import org.lexevs.dao.database.ibatis.registry.parameter.InsertOrUpdateRegistryBean;
import org.lexevs.dao.database.ibatis.registry.parameter.InsertOrUpdateRegistryEntryBean;
import org.lexevs.dao.database.prefix.PrefixResolver;
import org.lexevs.dao.database.schemaversion.LexGridSchemaVersion;
import org.lexevs.registry.model.Registry;
import org.lexevs.registry.model.RegistryEntry;
import org.lexevs.registry.service.Registry.ResourceType;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * The Class IbatisRegistryDao.
 * 
 * @author <a href="mailto:scott.bauer@nih.gov"Scott Bauer</a>
 */
@Transactional(transactionManager = "transactionManager")
public class IbatisRegistryDao extends AbstractIbatisDao implements RegistryDao {
	
	/** The Constant REGISTRY_ID. */
	private static final int REGISTRY_ID = 0;
	
	private static final String REGISTRY_NAMESPACE = "Registry.";

	private static final String DELETE_REGISTRY_ENTRY = REGISTRY_NAMESPACE + "deleteRegistryEntry";

	private static final String GET_REGISTRY_METADATA = REGISTRY_NAMESPACE + "getRegistryMetaData";

	private static final String INSERT_REGISTRY_ENTRY = REGISTRY_NAMESPACE + "insertRegistryEntry";

	private static final String GET_REGISTRY_ENTRY_FOR_URI_AND_VERSION = REGISTRY_NAMESPACE + "getRegistryEntryForUriAndVersion";

	private static final String UPDATE_REGISTRY_ENTRY = REGISTRY_NAMESPACE + "updateRegistryEntry";

	private static final String UPDATE_LAST_USED_DB_ID = REGISTRY_NAMESPACE + "updateLastUsedDbId";

	private static final String GET_REGISTRY_ENTRIES_BY_TYPE = REGISTRY_NAMESPACE + "getAllRegistryEntriesOfType";

	private static final String GET_REGISTRY_ENTRIES_BY_TYPE_AND_URI = REGISTRY_NAMESPACE + "getAllRegistryEntriesOfTypeAndURI";
	
	private static final String GET_REGISTRY_ENTRIES_BY_URI_AND_TYPES = REGISTRY_NAMESPACE + "getRegistryEntryByUriAndTypes";

	private static final String GET_REGISTRY_ENTRIES_BY_URI = REGISTRY_NAMESPACE + "getRegistryEntriesForUri";

	private static final String GET_ALL_REGISTRY_ENTRIES = REGISTRY_NAMESPACE + "getAllRegistryEntries";

	private static final String INIT_REGISTRY_METADATA = REGISTRY_NAMESPACE + "initRegistryMetadata";

	private static final String UPDATE_LAST_UPDATE_TIME = REGISTRY_NAMESPACE + "updateLastUpdateTime";

	private static final String GET_REGISTRY_ENTRIES_BY_TYPE_URI_AND_VERSION = REGISTRY_NAMESPACE + "getAllRegistryEntriesOfTypeURIAndVersion";
	
	/** The default history prefix. */
	private String defaultHistoryPrefix = "aaaa";
	
	/** The default coding scheme prefix. */
	private String defaultCodingSchemePrefix = "aaaa";
	
	@Autowired
	PrefixResolver prefixResolver;

	

	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#updateLastUpdateTime(java.util.Date)
	 */
	public void updateLastUpdateTime(Date lastUpdateTime) {
		Registry registry = getRegistryMetadataEntry();
		registry.setLastUpdateTime(new Timestamp(lastUpdateTime.getTime()));
		InsertOrUpdateRegistryBean bean = new InsertOrUpdateRegistryBean(registry);
		this.getSqlSessionTemplate().update(UPDATE_LAST_UPDATE_TIME, bean);
	}
	
	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#getLastUpdateTime()
	 */
	public Date getLastUpdateTime() {
		Registry registry = getRegistryMetadataEntry();
		return registry.getLastUpdateTime();
	}
	
	/**
	 * Gets the registry metadata entry.
	 * 
	 * @return the registry metadata entry
	 */
	protected Registry getRegistryMetadataEntry(){
		PrefixedParameter param = new PrefixedParameter(this.prefixResolver.resolveDefaultPrefix(),Integer.toString(REGISTRY_ID));
		return (Registry)this.getSqlSessionTemplate().selectOne(GET_REGISTRY_METADATA, param);
	}

	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#deleteRegistryEntry(org.lexevs.registry.model.RegistryEntry)
	 */
	public void deleteRegistryEntry(
			RegistryEntry entry) {
		SqlSessionTemplate session = null;
        try{
        	session = this.getSqlSessionTemplate();
        	PrefixedParameter param = new PrefixedParameter(prefixResolver.resolveDefaultPrefix(), entry.getId());
            session.delete(DELETE_REGISTRY_ENTRY, param);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#getLastUsedDbIdentifier()
	 */
	public String getLastUsedDbIdentifier() {
		return this.getRegistryMetadataEntry().getLastUsedDbIdentifer();
	}

	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#getLastUsedHistoryIdentifier()
	 */
	public String getLastUsedHistoryIdentifier() {
		return this.getRegistryMetadataEntry().getLastUsedHistoryIdentifer();
	}

	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#insertRegistryEntry(org.lexevs.registry.model.RegistryEntry)
	 */
	
	public void insertRegistryEntry(RegistryEntry entry) {
		entry.setId(this.getPrimaryKeyIncrementer().nextKey());
		InsertOrUpdateRegistryEntryBean param = new InsertOrUpdateRegistryEntryBean(entry);
        SqlSessionTemplate session = null;
        try  {
        	session = this.getSqlSessionTemplate();
            session.insert(INSERT_REGISTRY_ENTRY, param);
        } catch (Exception e) {
          
            e.printStackTrace();
        }
	}
	
	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#getRegistryEntryForUriAndVersion(java.lang.String, java.lang.String)
	 */
	public RegistryEntry getRegistryEntryForUriAndVersion(String uri, String version) throws LBParameterException {
		PrefixedParameterTuple param = new PrefixedParameterTuple(prefixResolver.resolveDefaultPrefix(), uri, version);
		List<RegistryEntry> entries = this.getSqlSessionTemplate().selectList(GET_REGISTRY_ENTRY_FOR_URI_AND_VERSION, param);
		if(entries == null || entries.size() == 0){
			throw new LBParameterException("No entry for URI: " + uri
					+ " - version " + version);
		} else if(entries.size() > 1){
			throw new LBParameterException("More than one entry for URI: " + uri
					+ " - version " + version);
		} 
		return entries.get(0);
	}
	

	public List<RegistryEntry> getAllRegistryEntriesOfUriAndTypes(String uri,
			ResourceType[] types) {
		PrefixedParameterCollection param = new PrefixedParameterCollection(
				prefixResolver.resolveDefaultPrefix(), 
				uri, 
				Stream.
					of(types).
					map(x -> x.name()).
					toList());
		return this.getSqlSessionTemplate().selectList(GET_REGISTRY_ENTRIES_BY_URI_AND_TYPES, param);
	}

	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#updateRegistryEntry(org.lexevs.registry.model.RegistryEntry)
	 */
	public void updateRegistryEntry(RegistryEntry entry) {
		SqlSessionTemplate session = null;
		InsertOrUpdateRegistryEntryBean param = new InsertOrUpdateRegistryEntryBean(entry);
        try {session = this.getSqlSessionTemplate();
            session.update(UPDATE_REGISTRY_ENTRY,param);

        } catch (Exception e) {

            e.printStackTrace();
        }
	}

	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#updateLastUsedDbIdentifier(java.lang.String)
	 */
	public void updateLastUsedDbIdentifier(String databaseIdentifier) {
		Registry registry = this.getRegistryMetadataEntry();
		registry.setLastUsedDbIdentifer(databaseIdentifier);
		InsertOrUpdateRegistryBean bean = new InsertOrUpdateRegistryBean(registry);
		SqlSessionTemplate session = null;
        try  { 
        	session = this.getSqlSessionTemplate();
            session.update(UPDATE_LAST_USED_DB_ID, bean);

        } catch (Exception e) {

            e.printStackTrace();
        }	
	}

	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#getAllRegistryEntriesOfType(org.lexevs.registry.service.Registry.ResourceType)
	 */
	public List<RegistryEntry> getAllRegistryEntriesOfType(ResourceType type) {
		PrefixedParameter bean = new PrefixedParameter(prefixResolver.resolveDefaultPrefix(), type.name());
		return this.getSqlSessionTemplate().selectList(GET_REGISTRY_ENTRIES_BY_TYPE, bean);
	}
	
	public List<RegistryEntry> getAllRegistryEntriesOfTypeAndURI(ResourceType type, String uri) {
		PrefixedParameterTuple bean = new PrefixedParameterTuple(prefixResolver.resolveDefaultPrefix(), type.name(), uri);
		return this.getSqlSessionTemplate().selectList(GET_REGISTRY_ENTRIES_BY_TYPE_AND_URI, bean);
	}
	
	public List<RegistryEntry> getAllRegistryEntriesOfTypeURIAndVersion(ResourceType type, String uri, String version) {
		PrefixedParameterTriple param = new PrefixedParameterTriple(prefixResolver.resolveDefaultPrefix(),type.name(), uri, version);
		return this.getSqlSessionTemplate().selectList(GET_REGISTRY_ENTRIES_BY_TYPE_URI_AND_VERSION, param);
	}
	
	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#getAllRegistryEntries()
	 */
	public List<RegistryEntry> getAllRegistryEntries() {
		PrefixedParameter param = new PrefixedParameter(prefixResolver.resolveDefaultPrefix(), null);
		return this.getSqlSessionTemplate().selectList(GET_ALL_REGISTRY_ENTRIES, param );
	}

	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#getRegistryEntriesForUri(java.lang.String)
	 */
	public List<RegistryEntry> getRegistryEntriesForUri(String uri) {
		PrefixedParameter param = new PrefixedParameter(prefixResolver.resolveDefaultPrefix(), uri);

		List<RegistryEntry> entries = this.getSqlSessionTemplate().selectList(GET_REGISTRY_ENTRIES_BY_URI, param);
		if(entries == null || entries.size() == 0){
			throw new RuntimeException("No entry for: " + uri);
		}
		return entries;
	}

	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.registry.RegistryDao#initRegistryMetadata()
	 */
	public void initRegistryMetadata() {
		Assert.isNull(this.getRegistryMetadataEntry(), "Registry Metadata has already been initialized.");

		Registry metadata = new Registry();
		metadata.setId(REGISTRY_ID);
		metadata.setLastUsedDbIdentifer(this.getDefaultCodingSchemePrefix());
		metadata.setLastUsedHistoryIdentifer(this.getDefaultHistoryPrefix());
		SqlSessionTemplate session = null;
		Date now = new Date(); 
		metadata.setLastUpdateTime(new Timestamp(now.getTime()));
		InsertOrUpdateRegistryBean param = new InsertOrUpdateRegistryBean(metadata);
        try {session = this.getSqlSessionTemplate(); 

            session.insert(INIT_REGISTRY_METADATA, param);

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	/**
	 * Gets the default history prefix.
	 * 
	 * @return the default history prefix
	 */
	public String getDefaultHistoryPrefix() {
		return defaultHistoryPrefix;
	}

	/**
	 * Sets the default history prefix.
	 * 
	 * @param defaultHistoryPrefix the new default history prefix
	 */
	public void setDefaultHistoryPrefix(String defaultHistoryPrefix) {
		this.defaultHistoryPrefix = defaultHistoryPrefix;
	}

	/**
	 * Gets the default coding scheme prefix.
	 * 
	 * @return the default coding scheme prefix
	 */
	public String getDefaultCodingSchemePrefix() {
		return defaultCodingSchemePrefix;
	}

	/**
	 * Sets the default coding scheme prefix.
	 * 
	 * @param defaultCodingSchemePrefix the new default coding scheme prefix
	 */
	public void setDefaultCodingSchemePrefix(String defaultCodingSchemePrefix) {
		this.defaultCodingSchemePrefix = defaultCodingSchemePrefix;
	}

	@Override
	public List<LexGridSchemaVersion> doGetSupportedLgSchemaVersions() {
		// TODO Auto-generated method stub
		return null;
	}
}