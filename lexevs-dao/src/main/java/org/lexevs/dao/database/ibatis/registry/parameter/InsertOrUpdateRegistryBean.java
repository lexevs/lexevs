
package org.lexevs.dao.database.ibatis.registry.parameter;

import java.sql.Timestamp;

import org.lexevs.dao.database.ibatis.parameter.IdableParameterBean;
import org.lexevs.registry.model.Registry;

/**
 * The Class InsertRelationsBean.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class InsertOrUpdateRegistryBean extends IdableParameterBean {
	
	/** The relations. */
	private Registry registry;
	
	/** The id. */
	private int id = 0;

	private Timestamp lastUpdateTime;

	private String lastUsedDbIdentifer;
	
	private String lastUsedHistoryIdentifer;
	
	public InsertOrUpdateRegistryBean() {
		super();
	}

	public InsertOrUpdateRegistryBean(Registry registry2) {
		super();
		id = registry.getId();
		lastUpdateTime = registry.getLastUpdateTime();
		lastUsedDbIdentifer = registry.getLastUsedDbIdentifer();
		lastUsedHistoryIdentifer = registry.getLastUsedHistoryIdentifer();
	}

	public Registry getRegistry() {
		return registry;
	}

	public void setRegistry(Registry registry) {
		this.registry = registry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getLastUsedDbIdentifer() {
		return lastUsedDbIdentifer;
	}

	public void setLastUsedDbIdentifer(String lastUsedDbIdentifer) {
		this.lastUsedDbIdentifer = lastUsedDbIdentifer;
	}

	public String getLastUsedHistoryIdentifer() {
		return lastUsedHistoryIdentifer;
	}

	public void setLastUsedHistoryIdentifer(String lastUsedHistoryIdentifer) {
		this.lastUsedHistoryIdentifer = lastUsedHistoryIdentifer;
	}
	
}

	