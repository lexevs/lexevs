/*
 * Copyright: (c) 2004-2010 Mayo Foundation for Medical Education and 
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
package org.lexevs.dao.database.ibatis;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.lexevs.dao.database.access.AbstractBaseDao;
import org.lexevs.dao.database.ibatis.batch.InOrderOrderingBatchInserterDecorator;
import org.lexevs.dao.database.ibatis.batch.SqlMapClientTemplateInserter;
import org.lexevs.dao.database.ibatis.batch.SqlMapExecutorBatchInserter;
import org.lexevs.dao.database.ibatis.batch.SqlSessionFactorySingleInserter;
import org.lexevs.dao.database.ibatis.batch.SqlSessionSingleInserter;
import org.lexevs.dao.database.ibatis.parameter.PrefixedParameter;
import org.lexevs.dao.database.inserter.BatchInserter;
import org.lexevs.dao.database.inserter.Inserter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class AbstractIbatisDao.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public abstract class AbstractIbatisDao<T> extends AbstractBaseDao implements InitializingBean {

	/** The sql map client template. */
	private SqlSession sqlMapClientTemplate;
	
	/** The non batch template inserter. */
	private Inserter<T> nonBatchTemplateInserter;
	
	private DataSource datasource;
	
	/** The VERSION s_ namespace. */
	public static String VERSIONS_NAMESPACE = "Versions.";
	
	/** The VERSION s_ namespace. */
	public static String VSENTRYSTATE_NAMESPACE = "VSEntryState.";
	
	/** query to see if entrystate exists.  */
	private static String CHECK_ENTRYSTATE_EXISTS = VERSIONS_NAMESPACE + "checkEntryStateExists";
	
	private static String CHECK_VSENTRYSTATE_EXISTS = VSENTRYSTATE_NAMESPACE + "checkVSEntryStateExists";
	
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
		setNonBatchTemplateInserter(new SqlSessionSingleInserter<T>());
	}
	
	
	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.access.LexGridSchemaVersionAwareDao#executeInTransaction(org.lexevs.dao.database.access.LexGridSchemaVersionAwareDao.IndividualDaoCallback)
	 */
	@Transactional
	public <T> T executeInTransaction(IndividualDaoCallback<T> callback) {
		return callback.execute();
	}



	/**
	 * Sets the sql map client template.
	 * 
	 * @param sqlMapClientTemplate the new sql map client template
	 */
	public void setSqlMapClientTemplate(SqlSession sqlMapClientTemplate) {
		this.sqlMapClientTemplate = sqlMapClientTemplate;
	}

	/**
	 * Gets the sql map client template.
	 * 
	 * @return the sql map client template
	 */
	public SqlSession getSqlMapClientTemplate() {
		return sqlMapClientTemplate;
	}
	
	public BatchInserter getBatchTemplateInserter(SqlMapExecutor executor) {
		return new InOrderOrderingBatchInserterDecorator(
					new SqlMapExecutorBatchInserter(executor));
	}

	/**
	 * Sets the non batch template inserter.
	 * 
	 * @param nonBatchTemplateInserter the new non batch template inserter
	 */
	public void setNonBatchTemplateInserter(Inserter<T> nonBatchTemplateInserter) {
		this.nonBatchTemplateInserter = nonBatchTemplateInserter;
	}

	/**
	 * Gets the non batch template inserter.
	 * 
	 * @return the non batch template inserter
	 */
	public Inserter<T> getNonBatchTemplateInserter() {
		return nonBatchTemplateInserter;
	}
	
	/**
	 * Method finds if the given entryState already exists. 
	 * Returns true if entryState exists or else returns false.
	 * 
	 * @param entryStateUId
	 * @return boolean
	 * @throws SQLException 
	 */
	public boolean entryStateExists(String prefix, String entryStateUId){
		
		String count = (String) this.getSqlMapClientTemplate().selectOne(
				CHECK_ENTRYSTATE_EXISTS, 
				new PrefixedParameter(prefix, entryStateUId));
		
		if( count != null &&  new Integer(count).intValue() > 0 )
			return true;
		
		return false;
	}
	
	/**
	 * Method finds if the given entryState already exists. 
	 * Returns true if entryState exists or else returns false.
	 * 
	 * @param entryStateUId
	 * @return boolean
	 */
	public boolean vsEntryStateExists(String prefix, String entryStateUId) {
		
		String count = null;
		count = (String) this.getSqlMapClientTemplate().selectOne(
				CHECK_VSENTRYSTATE_EXISTS, 
				new PrefixedParameter(prefix, entryStateUId));
		
		if( count != null &&  new Integer(count).intValue() > 0 )
			return true;
		
		return false;
	}
}