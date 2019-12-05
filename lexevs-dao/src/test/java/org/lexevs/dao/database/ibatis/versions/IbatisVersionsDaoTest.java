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
package org.lexevs.dao.database.ibatis.versions;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.LexGrid.versions.EntryState;
import org.LexGrid.versions.types.ChangeType;
import org.junit.Test;
import org.lexevs.dao.database.access.versions.VersionsDao.EntryStateType;
import org.lexevs.dao.test.LexEvsDbUnitTestBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class IbatisVersionsDaoTest.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
@Transactional
public class IbatisVersionsDaoTest extends LexEvsDbUnitTestBase {

	/** The ibatis versions dao. */
	@Autowired
	private IbatisVersionsDao ibatisVersionsDao;

	/**
	 * Insert entry state.
	 */
	@Test
	public void insertEntryState(){

		EntryState es = new EntryState();
		es.setChangeType(ChangeType.REMOVE);
		es.setRelativeOrder(24l);
		es.setContainingRevision("containingRevision");
		es.setPrevRevision("previousRevision");
		
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
		"values ('1', 'csname', 'csuri', 'csversion')");
		
		ibatisVersionsDao.insertEntryState(
				"1",
				"1",
				"1", 
				EntryStateType.CODINGSCHEME, 
				null, 
				es);
		
		template.queryForObject("Select * from EntryState", new RowMapper(){

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				assertEquals("codingScheme", rs.getString(3));
				assertEquals(rs.getString(4), ChangeType.REMOVE.toString());
				assertEquals(rs.getLong(5), 24l);
				assertEquals(rs.getString(6), null);
				assertEquals(rs.getString(7), null);
							
				return null;
			}
		});
	}
}