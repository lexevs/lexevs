
package org.lexevs.dao.database.ibatis.registry.parameter;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.lexevs.dao.database.ibatis.parameter.IdableParameterBean;
import org.lexevs.registry.model.RegistryEntry;
import org.lexevs.registry.service.Registry.ResourceType;

/**
 * The Class InsertRelationsBean.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class InsertOrUpdateRegistryEntryBean extends IdableParameterBean {
	
	/** The relations. */
	private RegistryEntry registryEntry;
	

	public String id;
	
	private Timestamp activationDate;
	
	private String baseRevision;

	private String dbName;
	
	private String dbSchemaDescription;
	
	private String dbSchemaVersion;
	
	private String dbUri;
	
	private Timestamp deactivationDate;
	
	private String fixedAtRevision;
	
	private Boolean isLocked;
	
	private Timestamp lastUpdateDate;
	
	private String prefix;

	private String stagingPrefix;

	private ResourceType resourceType;
	
	private String resourceVersion;

	private String resourceUri;

	private String status;
	
	private String tag;
	
	private String supplementsUri;
	
	private String supplementsVersion;
	
	public InsertOrUpdateRegistryEntryBean() {
		super();
	}

	public InsertOrUpdateRegistryEntryBean(RegistryEntry entry) {
		super();
		
		id = entry.getId();
		
		activationDate = entry.getActivationDate();
		
		baseRevision = entry.getBaseRevision();

		dbName = entry.getDbName();
		
		dbSchemaDescription = entry.getDbSchemaDescription();
		
		dbSchemaVersion = entry.getDbSchemaVersion();
		
		dbUri = entry.getDbUri();
		
		deactivationDate = entry.getDeactivationDate();
		
		fixedAtRevision = entry.getFixedAtRevision();
		
		isLocked = entry.getIsLocked();
		
		lastUpdateDate = entry.getLastUpdateDate();
		
		prefix = entry.getPrefix();

		stagingPrefix = entry.getStagingPrefix();

		resourceType = entry.getResourceType();
		
		resourceVersion = entry.getBaseRevision();

		resourceUri = entry.getResourceUri();

		status = entry.getStatus();
		
		tag = entry.getTag();
		
		supplementsUri = entry.getSupplementsUri();
		
		supplementsVersion = entry.getSupplementsVersion();
	}

	public RegistryEntry getRegistryEntry() {
		return registryEntry;
	}

	public void setRegistryEntry(RegistryEntry registryEntry) {
		this.registryEntry = registryEntry;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Timestamp activationDate) {
		this.activationDate = activationDate;
	}

	public String getBaseRevision() {
		return baseRevision;
	}

	public void setBaseRevision(String baseRevision) {
		this.baseRevision = baseRevision;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbSchemaDescription() {
		return dbSchemaDescription;
	}

	public void setDbSchemaDescription(String dbSchemaDescription) {
		this.dbSchemaDescription = dbSchemaDescription;
	}

	public String getDbSchemaVersion() {
		return dbSchemaVersion;
	}

	public void setDbSchemaVersion(String dbSchemaVersion) {
		this.dbSchemaVersion = dbSchemaVersion;
	}

	public String getDbUri() {
		return dbUri;
	}

	public void setDbUri(String dbUri) {
		this.dbUri = dbUri;
	}

	public Timestamp getDeactivationDate() {
		return deactivationDate;
	}

	public void setDeactivationDate(Timestamp deactivationDate) {
		this.deactivationDate = deactivationDate;
	}

	public String getFixedAtRevision() {
		return fixedAtRevision;
	}

	public void setFixedAtRevision(String fixedAtRevision) {
		this.fixedAtRevision = fixedAtRevision;
	}

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getStagingPrefix() {
		return stagingPrefix;
	}

	public void setStagingPrefix(String stagingPrefix) {
		this.stagingPrefix = stagingPrefix;
	}

	public ResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceVersion() {
		return resourceVersion;
	}

	public void setResourceVersion(String resourceVersion) {
		this.resourceVersion = resourceVersion;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getSupplementsUri() {
		return supplementsUri;
	}

	public void setSupplementsUri(String supplementsUri) {
		this.supplementsUri = supplementsUri;
	}

	public String getSupplementsVersion() {
		return supplementsVersion;
	}

	public void setSupplementsVersion(String supplementsVersion) {
		this.supplementsVersion = supplementsVersion;
	}

}

	