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
package org.lexevs.dao.database.ibatis.batch;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.lexevs.dao.database.inserter.Inserter;


/**
 * The Class SqlMapClientTemplateInserter.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 * @param <T>
 */
public class SqlSessionSingleInserter<T> implements Inserter<T>{

	/** The sql map client template. */
	private SqlSessionFactory sqlSessionFactory;
	
	

	/* (non-Javadoc)
	 * @see org.lexevs.dao.database.inserter.Inserter#insert(java.lang.String, java.lang.Object)
	 */
	public void insert(String sql, T parameter) {
		SqlSession session = sqlSessionFactory.openSession();
	    try {
	        session.insert(sql, parameter);
	        session.commit();
	    } catch (Throwable t) {
	        session.rollback();
	        //logger.error("Exception occurred during updateBatch : ", t);
	        throw new PersistenceException(t);
	    } finally {
	        session.close();
	    }
	}


}