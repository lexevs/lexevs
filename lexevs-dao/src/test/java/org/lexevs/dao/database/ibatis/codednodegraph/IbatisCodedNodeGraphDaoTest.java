
package org.lexevs.dao.database.ibatis.codednodegraph;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept;
import org.LexGrid.LexBIG.DataModel.Core.ConceptReference;
import org.LexGrid.LexBIG.Extensions.Generic.MappingExtension.Direction;
import org.LexGrid.LexBIG.Extensions.Generic.MappingExtension.MappingSortOption;
import org.LexGrid.LexBIG.Extensions.Generic.MappingExtension.MappingSortOptionName;
import org.LexGrid.LexBIG.Extensions.Generic.MappingExtension.QualifierSortOption;
import org.junit.Before;
import org.junit.Test;
import org.lexevs.dao.database.access.codednodegraph.CodedNodeGraphDao.TripleNode;
import org.lexevs.dao.database.operation.LexEvsDatabaseOperations.TraverseAssociations;
import org.lexevs.dao.database.service.codednodegraph.CodedNodeGraphService.Order;
import org.lexevs.dao.database.service.codednodegraph.CodedNodeGraphService.Sort;
import org.lexevs.dao.database.service.codednodegraph.model.ColumnSortType;
import org.lexevs.dao.database.service.codednodegraph.model.CountConceptReference;
import org.lexevs.dao.database.service.codednodegraph.model.GraphQuery.CodeNamespacePair;
import org.lexevs.dao.database.service.codednodegraph.model.GraphQuery.QualifierNameValuePair;
import org.lexevs.dao.database.utility.DaoUtility;
import org.lexevs.dao.test.LexEvsDbUnitTestBase;
import org.lexevs.registry.utility.RegistryUtility;
import org.lexevs.util.TestUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class IbatisAssociationDaoTest.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
@TransactionConfiguration
public class IbatisCodedNodeGraphDaoTest extends LexEvsDbUnitTestBase {
	
	/** The ibatis association dao. */
	@Resource
	private IbatisCodedNodeGraphDao ibatisCodedNodeGraphDao;
	
	@Before
	public void loadCodingScheme() throws Exception{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri", "csversion"));
		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
				"values ('1', 'csname', 'csuri', 'csversion')");
	}

	@Test
	public void testListCodeRelationshipsNoTransitive() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		List<String> rels = ibatisCodedNodeGraphDao.
			listCodeRelationships("1", null, "s-code", "s-ns", "t-code1", "t-ns1", null, null, null, null, null, null, null, null, false);
			
		
		assertEquals(1, rels.size());
		assertTrue(rels.contains("1"));
	}
	
	@Test
	public void testListCodeRelationshipsEntityTypeRestriction() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
	
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
		"values ('2', '1', 't-code1', 't-ns1')");

		template.execute("Insert into entitytype (entityGuid, entityType) " +
		"values ('2', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		List<String> rels = ibatisCodedNodeGraphDao.
			listCodeRelationships("1", null, "s-code", "s-ns", "t-code1", "t-ns1", null, null, null, null, null, null, DaoUtility.createNonTypedList("concept"), null, true);
			
		
		assertEquals(1, rels.size());
		assertTrue(rels.contains("1"));
	}

	@Test
	public void testListCodeRelationshipsEntityTypeRestrictionOneWrong() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());
	
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
	
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'definition')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
		"values ('2', '1', 't-code1', 't-ns1')");

		template.execute("Insert into entitytype (entityGuid, entityType) " +
		"values ('2', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		List<String> rels = ibatisCodedNodeGraphDao.
			listCodeRelationships("1", null, "s-code", "s-ns", "t-code1", "t-ns1", null, null, null, null, null, null, DaoUtility.createNonTypedList("concept"), null, true);
			
		
		assertEquals(0, rels.size());
	}
	
	@Test
	public void testListCodeRelationshipsEntityTypeRestrictionBothWrong() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
	
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'definition')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
		"values ('2', '1', 't-code1', 't-ns1')");

		template.execute("Insert into entitytype (entityGuid, entityType) " +
		"values ('2', 'instance')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		List<String> rels = ibatisCodedNodeGraphDao.
			listCodeRelationships("1", null, "s-code", "s-ns", "t-code1", "t-ns1", null, null, null, null, null, null, DaoUtility.createNonTypedList("concept"), null, true);
			
		
		assertEquals(0, rels.size());
	}
	
	@Test
	public void testListCodeRelationshipsEntityTypeRestrictionTwoTypes() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());
	
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
	
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'definition')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
		"values ('2', '1', 't-code1', 't-ns1')");

		template.execute("Insert into entitytype (entityGuid, entityType) " +
		"values ('2', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		List<String> rels = ibatisCodedNodeGraphDao.
			listCodeRelationships("1", null, "s-code", "s-ns", "t-code1", "t-ns1", null, null, null, null, null, null, DaoUtility.createNonTypedList("concept", "definition"), null, true);
			
		
		assertEquals(1, rels.size());
	}
	
	@Test
	public void testListCodeRelationshipsAnonymousRestrictionFalse() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, isAnonymous) " +
			"values ('1', '1', 's-code', 's-ns', '0')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, isAnonymous) " +
		"values ('2', '1', 't-code1', 't-ns1', '0')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		List<String> rels = ibatisCodedNodeGraphDao.
			listCodeRelationships("1", null, "s-code", "s-ns", "t-code1", "t-ns1", null, null, null, null, null, null, null, false, true);
			
		assertEquals(1, rels.size());
	}
	
	@Test
	public void testListCodeRelationshipsAnonymousRestrictionTrue() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, isAnonymous) " +
			"values ('1', '1', 's-code', 's-ns', '1')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, isAnonymous) " +
		"values ('2', '1', 't-code1', 't-ns1', '1')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		List<String> rels = ibatisCodedNodeGraphDao.
			listCodeRelationships("1", null, "s-code", "s-ns", "t-code1", "t-ns1", null, null, null, null, null, null, null, true, true);
			
		assertEquals(1, rels.size());
	}
	
	@Test
	public void testListCodeRelationshipsAnonymousRestrictionOneWrong() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, isAnonymous) " +
			"values ('1', '1', 's-code', 's-ns', '1')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, isAnonymous) " +
		"values ('2', '1', 't-code1', 't-ns1', '0')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		List<String> rels = ibatisCodedNodeGraphDao.
			listCodeRelationships("1", null, "s-code", "s-ns", "t-code1", "t-ns1", null, null, null, null, null, null, null, true, true);
			
		assertEquals(0, rels.size());
	}
	
	@Test
	public void testListCodeRelationshipsWithTransitive() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('12', '1', 'apname2')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentitytr" +
				" values ('1'," +
				" '12'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
				" null)");
		
		List<String> rels = ibatisCodedNodeGraphDao.
			listCodeRelationships("1", null, "s-code", "s-ns", "t-code1", "t-ns1", null, null, null, null, null, null, null, null, true);
			
		assertEquals(2, rels.size());
		assertTrue(rels.contains("1"));
		assertTrue(rels.contains("12"));
	}

	@Test
	public void testGetTripleUids() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());


		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		List<String> uids = ibatisCodedNodeGraphDao.
			getTripleUidsContainingSubject(
					"1", 
					"1", 
					"s-code", 
					"s-ns", 
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					0, 
					-1);
		
		assertEquals(2, uids.size());
		assertTrue(uids.contains("1"));
		assertTrue(uids.contains("2"));
	}
	
	@Test
	public void testGetTripleUidsContainingSubjectCount() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());


		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		Map<String,Integer> uids = ibatisCodedNodeGraphDao.
			getTripleUidsContainingSubjectCount(
					"1", null, "s-code", "s-ns", null, null, null, null, null, null);

		assertEquals(1, uids.keySet().size());
		assertEquals(new Integer(2), uids.get("apname"));
	}
	
	@Test
	public void testGetTripleUidsContainingObjectCount() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());


		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		Map<String,Integer> uids = ibatisCodedNodeGraphDao.
			getTripleUidsContainingObjectCount(
					"1", null, "t-code1", "t-ns1", null, null, null, null, null, null);
		
		assertEquals(1, uids.keySet().size());
		assertEquals(new Integer(1), uids.get("apname"));
	}
	
	@Test
	public void testAssociatedConceptsSourceOf() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
	
		List<? extends AssociatedConcept> associatedConcepts = 
			ibatisCodedNodeGraphDao.getAssociatedConceptsFromUid(
					"1", 
					DaoUtility.createNonTypedList("1", "2"),
					null,
					TripleNode.SUBJECT);
		
		assertEquals(2,associatedConcepts.size());
	}
	
	@Test
	public void testAssociatedConceptsSourceOfWithSortDesc() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 'as-code', " +
				" 'as-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 'bs-code', " +
				" 'bs-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		Sort sort = new Sort(ColumnSortType.CODE, Order.DESC);
	
		List<? extends AssociatedConcept> associatedConcepts = 
			ibatisCodedNodeGraphDao.getAssociatedConceptsFromUid(
					"1", 
					DaoUtility.createNonTypedList("1", "2"),
					Arrays.asList(sort),
					TripleNode.SUBJECT);
		
		assertEquals(2,associatedConcepts.size());
		assertEquals("bs-code", associatedConcepts.get(0).getCode());
		assertEquals("as-code", associatedConcepts.get(1).getCode());
	}
	
	@Test
	public void testAssociatedConceptsSourceOfWithSortAsc() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 'as-code', " +
				" 'as-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 'bs-code', " +
				" 'bs-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		Sort sort = new Sort(ColumnSortType.CODE, Order.ASC);
	
		List<? extends AssociatedConcept> associatedConcepts = 
			ibatisCodedNodeGraphDao.getAssociatedConceptsFromUid(
					"1", 
					DaoUtility.createNonTypedList("1", "2"),
					Arrays.asList(sort),
					TripleNode.SUBJECT);
		
		assertEquals(2,associatedConcepts.size());
		assertEquals("as-code", associatedConcepts.get(0).getCode());
		assertEquals("bs-code", associatedConcepts.get(1).getCode());
	}
	
	@Test
	public void testAssociatedConceptTargetOf() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
		"values ('2', '1', 't-code', 't-ns')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
	
		List<? extends AssociatedConcept> associatedConcepts = ibatisCodedNodeGraphDao.getAssociatedConceptsFromUid(
				"1", 
				DaoUtility.createNonTypedList("1"), null, TripleNode.OBJECT);
		
		assertEquals(1,associatedConcepts.size());
		AssociatedConcept associatedConcept = associatedConcepts.get(0);
		
		assertEquals("t-code",associatedConcept.getCode());
		assertEquals("t-ns",associatedConcept.getCodeNamespace());
	}

	@Test
	public void testGetTripleUidsContainingSubjectCountWithAnonymousRestrictionWithNone() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		Map<String,Integer> uids = 
			ibatisCodedNodeGraphDao.
				getTripleUidsContainingSubjectCount("1", null, "s-code", "s-ns", null, null, null, null, null, false);
	
		assertTrue(uids.isEmpty());
	}

	@Test
	public void testGetTripleUidsContainingSubjectCountWithAnonymousRestrictionOnlyAnonymous() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, isAnonymous) " +
			"values ('1', '1', 's-code', 's-ns', '1')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, isAnonymous) " +
			"values ('2', '1', 't-code', 't-ns', '1')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		Map<String,Integer> uids = 
			ibatisCodedNodeGraphDao.
				getTripleUidsContainingSubjectCount("1", null, "s-code", "s-ns", null, null, null, null, null, true);
	
		assertEquals(1,uids.size());
	}
	
	@Test
	public void testGetTripleUidsContainingSubjectCountWithAnonymousRestrictionOnlyNonAnonymous() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, isAnonymous) " +
			"values ('2', '1', 't-code', 't-ns', '0')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('2', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		Map<String,Integer> uids = 
			ibatisCodedNodeGraphDao.
				getTripleUidsContainingSubjectCount("1", null, "s-code", "s-ns", null, null, null, null, null, false);
	
		assertEquals(1,uids.size());
	}

	@Test
	public void testGetTripleUidsContainingSubjectCountWithEntityTypeRestriction() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 't-code', 't-ns')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		Map<String,Integer> uids = 
			ibatisCodedNodeGraphDao.
				getTripleUidsContainingSubjectCount("1", null, "s-code", "s-ns", null, null, null, null, DaoUtility.createNonTypedList("concept"), null);
	
		assertEquals(1, uids.keySet().size());
		assertEquals(new Integer(1), uids.get("apname"));
	}
	
	@Test
	public void testGetTripleUidsContainingSubjectCountWithWrongEntityTypeRestriction() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		Map<String,Integer> uids = 
			ibatisCodedNodeGraphDao.
				getTripleUidsContainingSubjectCount("1", null, "s-code", "s-ns", null, null, null, null, DaoUtility.createNonTypedList("WRONG_ENTITY_TYPE"), null);
	
		assertTrue(uids.isEmpty());
	}
	
	@Test
	public void testGetTripleUidsContainingSubjectCountWithMultipleEntityTypeRestriction() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 't-code', 't-ns')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'some_other_type')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		Map<String,Integer> uids = 
			ibatisCodedNodeGraphDao.
				getTripleUidsContainingSubjectCount("1", null, "s-code", "s-ns", null, null, null, null, DaoUtility.createNonTypedList("some_other_type"), null);
	
		assertEquals(1, uids.keySet().size());
		assertEquals(new Integer(1), uids.get("apname"));
	}
	
	@Test
	public void testGetTripleUidsContainingSubjectCountWithQualifierName() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		template.execute("insert into " +
				"entityassnquals values ( " +
				"'1', " +
				"'1'," +
				"'qualName'," +
				"'qualValue'," +
				"'1' )");
		List<QualifierNameValuePair> list = new ArrayList<QualifierNameValuePair>();
		list.add(new QualifierNameValuePair("qualName", null));
		
		Map<String,Integer> uids = ibatisCodedNodeGraphDao.
			getTripleUidsContainingSubjectCount(
					"1", null, "s-code", "s-ns", null, list, null, null, null, null);
		
		assertEquals(1, uids.keySet().size());
		assertEquals(new Integer(1), uids.get("apname"));
	}
	
	@Test
	public void testGetTripleUidsContainingSubjectCountWithBadQualifierName() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		template.execute("insert into " +
				"entityassnquals values ( " +
				"'1', " +
				"'1'," +
				"'qualName'," +
				"'qualValue'," +
				"'1' )");
		List<QualifierNameValuePair> list = new ArrayList<QualifierNameValuePair>();
		list.add(new QualifierNameValuePair("BAD_qualName", null));
		
		Map<String,Integer> uids = ibatisCodedNodeGraphDao.
			getTripleUidsContainingSubjectCount(
					"1", null, "s-code", "s-ns", null, list, null, null, null, null);
		
		assertEquals(0, uids.keySet().size());
	}
	
	@Test
	public void testGetTripleUidsContainingSubjectCountWithQualifierNameAndValue() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		template.execute("insert into " +
				"entityassnquals values ( " +
				"'1', " +
				"'1'," +
				"'qualName'," +
				"'qualValue'," +
				"'1'  )");
		List<QualifierNameValuePair> list = new ArrayList<QualifierNameValuePair>();
		list.add(new QualifierNameValuePair("qualName", "qualValue"));
		
		Map<String,Integer> uids = ibatisCodedNodeGraphDao.
			getTripleUidsContainingSubjectCount(
					"1", null, "s-code", "s-ns", null, list, null, null, null, null);
		
		assertEquals(1, uids.keySet().size());
		assertEquals(new Integer(1), uids.get("apname"));
	}
	
	@Test
	public void testGetTripleUidsContainingSubjectCountWithQualifierNameAndBadValue() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		template.execute("insert into " +
				"entityassnquals values ( " +
				"'1', " +
				"'1'," +
				"'qualName'," +
				"'qualValue'," +
				"'1' )");
		List<QualifierNameValuePair> list = new ArrayList<QualifierNameValuePair>();
		list.add(new QualifierNameValuePair("qualName", "BAD_qualValue"));
		
		Map<String,Integer> uids = ibatisCodedNodeGraphDao.
			getTripleUidsContainingSubjectCount(
					"1", null, "s-code", "s-ns", null, list, null, null, null, null);
		
		assertEquals(0, uids.keySet().size());
	}
	
	@Test
	public void testGetTripleUidsContainingSubjectCountWithRestrictToCode() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		template.execute("insert into " +
				"entityassnquals values ( " +
				"'1', " +
				"'1'," +
				"'qualName'," +
				"'qualValue'," +
				"'1' )");
		
		CodeNamespacePair pair = new CodeNamespacePair("t-code2", "t-ns2");
	
		Map<String,Integer> uids = ibatisCodedNodeGraphDao.
			getTripleUidsContainingSubjectCount(
					"1", null, "s-code", "s-ns", null, null, DaoUtility.createNonTypedList(pair), null, null, null);
		
		assertEquals(1, uids.keySet().size());
		assertEquals(new Integer(1), uids.get("apname"));
	}
	
	@Test
	public void testGetTripleUidsContainingSubjectCountWithRestrictToCodesystem() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
	
		Map<String,Integer> uids = ibatisCodedNodeGraphDao.
			getTripleUidsContainingSubjectCount(
					"1", null, "s-code", "s-ns", null, null, null, DaoUtility.createNonTypedList("t-ns2"), null, null);
		
		assertEquals(1, uids.keySet().size());
		assertEquals(new Integer(1), uids.get("apname"));
	}
	
	@Test
	public void testGetTripleUidsContainingSubjectWithRestrictToCodesystem() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
	
		List<String> uids = ibatisCodedNodeGraphDao.
			getTripleUidsContainingSubject(
					"1", "1", "s-code", "s-ns", null, null, null, DaoUtility.createNonTypedList("t-ns2"), null, null, null, 0, -1);
		
		assertEquals(1, uids.size());
		assertEquals("2", uids.get(0));
	}
	
	@Test
	public void testGetRootsWithNoAssociationRestrictionIndividually() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");

		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");

		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");

		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 't-code1', " +
				" 't-ns1'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id2', null, null, null, null, null, null, null, null)");


		List<ConceptReference> uids = ibatisCodedNodeGraphDao.getRootNodes("1", null, null, null, null,TraverseAssociations.INDIVIDUALLY, null, 0, -1);

		assertEquals(1, uids.size());

		assertEquals("s-code", uids.get(0).getCode());
	}
	
	public void testGetRootsWithNoAssociationRestrictionTogether() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");

		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");

		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");

		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 't-code1', " +
				" 't-ns1'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");


		List<ConceptReference> uids = ibatisCodedNodeGraphDao.getRootNodes("1", null, null, null, null,TraverseAssociations.TOGETHER, null, 0, -1);

		assertEquals(1, uids.size());
		
		assertEquals("s-code", uids.get(0).getCode());
	}
	
	@Test
	public void testGetRootsWithAssociationRestriction() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");

		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");

		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");

		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 't-code1', " +
				" 't-ns1'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id2', null, null, null, null, null, null, null, null)");


		List<ConceptReference> uids = ibatisCodedNodeGraphDao.getRootNodes("1", DaoUtility.createNonTypedList("1"), null, null, null,TraverseAssociations.TOGETHER, null, 0, -1);

		assertEquals(1, uids.size());

		assertEquals("s-code", uids.get(0).getCode());
	}
	
	@Test
	public void testGetRootsWithWrongAssociationRestriction() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");

		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");

		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");

		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 't-code1', " +
				" 't-ns1'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");


		List<ConceptReference> uids = ibatisCodedNodeGraphDao.
		getRootNodes("1", DaoUtility.createNonTypedList("999"), null,null, null,
				TraverseAssociations.INDIVIDUALLY, null, 0, -1);

		assertEquals(0, uids.size());
	}
	
	@Test
	public void testGetRootsWithOneWrongOneRightAssociationRestriction() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");

		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");

		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");

		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 't-code1', " +
				" 't-ns1'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");


		List<ConceptReference> uids = ibatisCodedNodeGraphDao.getRootNodes("1", 
				DaoUtility.createNonTypedList("999", "1"), null,null, null, TraverseAssociations.TOGETHER, null, 0, -1);

		assertEquals(1, uids.size());

		assertEquals("s-code", uids.get(0).getCode());
	}
	
	@Test
	public void testGetRootsWithQualifierRestriction() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");

		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");

		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");

		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 't-code1', " +
				" 't-ns1'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnquals" +
				" values ('1'," +
				" '2'," +
				" 'test', " +
				" 'testValue'," +
				" null )");

		QualifierNameValuePair quals = new QualifierNameValuePair("test","testValue");
		
		List<ConceptReference> uids = ibatisCodedNodeGraphDao.getRootNodes("1", 
				DaoUtility.createNonTypedList("1"), Arrays.asList(quals), null, null,TraverseAssociations.TOGETHER, null, 0, -1);

		assertEquals(1, uids.size());

		assertEquals("t-code1", uids.get(0).getCode());
	}
	
	@Test
	public void testGetTailsWithNoAssociationRestriction() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");

		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");

		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");

		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 't-code1', " +
				" 't-ns1'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");


		List<ConceptReference> uids = ibatisCodedNodeGraphDao.getTailNodes("1", null, null, null, null,TraverseAssociations.INDIVIDUALLY, null, 0, -1);

		assertEquals(1, uids.size());

		assertEquals("t-code2", uids.get(0).getCode());
	}
	
	@Test
	public void testGetTailsWithAssociationRestriction() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");

		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");

		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");

		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 't-code1', " +
				" 't-ns1'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");


		List<ConceptReference> uids = ibatisCodedNodeGraphDao.getTailNodes("1", DaoUtility.createNonTypedList("1"), null, null, null,TraverseAssociations.INDIVIDUALLY, null, 0, -1);

		assertEquals(1, uids.size());

		assertEquals("t-code2", uids.get(0).getCode());
	}
	
	@Test
	public void testGetTailsWithWrongAssociationRestriction() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");

		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");

		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");

		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 't-code1', " +
				" 't-ns1'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");


		List<ConceptReference> uids = ibatisCodedNodeGraphDao.getTailNodes("1", DaoUtility.createNonTypedList("999"), null, null, null, TraverseAssociations.INDIVIDUALLY, null, 0, -1);

		assertEquals(0, uids.size());
	}
	
	@Test
	public void testGetTailsWithOneWrongOneRightAssociationRestriction() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");

		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");

		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");

		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 't-code1', " +
				" 't-ns1'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");


		List<ConceptReference> uids = ibatisCodedNodeGraphDao.getTailNodes("1", DaoUtility.createNonTypedList("999", "1"), null, null, null, TraverseAssociations.INDIVIDUALLY, null, 0, -1);

		assertEquals(1, uids.size());

		assertEquals("t-code2", uids.get(0).getCode());
	}
	
	@Test
	public void testGetCountConceptReferencesContainingSubject() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());
	
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		ConceptReference ref = new ConceptReference();
		ref.setCode("s-code");
		ref.setCodeNamespace("s-ns");
		
		List<ConceptReference> codeList = Arrays.asList(ref);
		
		List<CountConceptReference> refs = 
			ibatisCodedNodeGraphDao.
				getCountConceptReferencesContainingSubject("1", null, codeList, null, null, null, null, null, null);
	
		assertEquals(1,refs.size());
		
		assertEquals("s-code", refs.get(0).getCode());
		assertEquals("s-ns", refs.get(0).getCodeNamespace());
	}
	
	@Test
	public void testGetCountConceptReferencesContainingObject() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());
	
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		ConceptReference ref = new ConceptReference();
		ref.setCode("t-code");
		ref.setCodeNamespace("t-ns");
		
		List<ConceptReference> codeList = Arrays.asList(ref);
		
		List<CountConceptReference> refs = 
			ibatisCodedNodeGraphDao.
				getCountConceptReferencesContainingObject("1", null, codeList, null, null, null, null, null, null);
	
		assertEquals(1,refs.size());
		
		assertEquals("t-code", refs.get(0).getCode());
		assertEquals("t-ns", refs.get(0).getCodeNamespace());
	}
	
	@Test
	public void testGetConceptReferencesContainingSubject() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		ConceptReference ref = new ConceptReference();
		ref.setCode("s-code");
		ref.setCodeNamespace("s-ns");
		
		List<ConceptReference> codeList = Arrays.asList(ref);
		
		List<ConceptReference> refs = 
			ibatisCodedNodeGraphDao.
				getConceptReferencesContainingSubject("1", null, codeList, null, null, null, null, null, null, null, 0, -1);
	
		assertEquals(1,refs.size());
		
		assertEquals("t-code", refs.get(0).getCode());
		assertEquals("t-ns", refs.get(0).getCodeNamespace());
	}
	
	@Test
	public void testGetConceptReferencesContainingSubjectWithMultiple() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		ConceptReference ref = new ConceptReference();
		ref.setCode("s-code");
		ref.setCodeNamespace("s-ns");
		
		List<ConceptReference> codeList = Arrays.asList(ref);
		
		List<ConceptReference> refs = 
			ibatisCodedNodeGraphDao.
				getConceptReferencesContainingSubject("1", null, codeList, null, null, null, null, null, null, null, 0, -1);
	
		assertEquals(2,refs.size());
		
		assertTrue(TestUtils.containsConceptReference(refs, "t-code"));
		assertTrue(TestUtils.containsConceptReference(refs, "t-code2"));
	}
	
	@Test
	public void testGetConceptReferencesContainingObject() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		ConceptReference ref = new ConceptReference();
		ref.setCode("t-code");
		ref.setCodeNamespace("t-ns");
		
		List<ConceptReference> codeList = Arrays.asList(ref);
		
		List<ConceptReference> refs = 
			ibatisCodedNodeGraphDao.
				getConceptReferencesContainingObject("1", null, codeList, null, null, null, null, null, null, null, 0, -1);
	
		assertEquals(1,refs.size());
		
		assertEquals("s-code", refs.get(0).getCode());
		assertEquals("s-ns", refs.get(0).getCodeNamespace());
	}
	
	@Test
	public void testGetConceptReferencesContainingObjectWithLimit() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code2', " +
				" 's-ns2'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id', null, null, null, null, null, null, null, null)");
	
		ConceptReference ref = new ConceptReference();
		ref.setCode("t-code");
		ref.setCodeNamespace("t-ns");
		
		List<ConceptReference> codeList = Arrays.asList(ref);
		
		List<ConceptReference> refs = 
			ibatisCodedNodeGraphDao.
				getConceptReferencesContainingObject("1", null, codeList, null, null, null, null, null, null, null, 0, 1);
	
		assertEquals(1,refs.size());
		
		ConceptReference firstResult = refs.get(0);
		
		refs = 
			ibatisCodedNodeGraphDao.
				getConceptReferencesContainingObject("1", null, codeList, null, null, null, null, null, null, null, 1, 1);
		
		ConceptReference secondResult = refs.get(0);
		
		assertFalse(firstResult.getCode().equals(secondResult.getCode()));
	}
	
	@Test
	public void testGetTripleUidsContainingSubjectWithSort() throws SQLException{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());
	
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace) " +
			"values ('1', '1', 's-code', 's-ns')");
		
		template.execute("Insert into entitytype (entityGuid, entityType) " +
			"values ('1', 'concept')");

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
		"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id2', null, null, null, null, null, null, null, null)");
	
		Sort sort = new Sort(ColumnSortType.CODE, Order.DESC);
		
		List<String> uids = 
			ibatisCodedNodeGraphDao.getTripleUidsContainingSubject("1", null, "s-code", "s-ns", null, null, null, null, null, null, Arrays.asList(sort), 0, -1);
	
		assertEquals(2, uids.size());
		assertEquals("2", uids.get(0));
		assertEquals("1", uids.get(1));
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerNoSorts() throws Exception {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('2', 'sourcecsname', 'csuri-source', 'csversion')");
		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('3', 'targetcsname', 'csuri-target', 'csversion')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('1', '2', 's-code', 's-ns', 'source-mapping-description')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('2', '3', 't-code', 't-ns', 'target-mapping-description')");
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-source", "csversion"));
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-target", "csversion"));
		
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");

		List<String> uids = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainer("1", "2", "3", "c-name", null, 0, -1);
		
		assertEquals(1,uids.size());
		assertEquals("1", uids.get(0));
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerSourceEnityCodeSortAsc() throws Exception {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('2', 'sourcecsname', 'csuri-source', 'csversion')");
		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('3', 'targetcsname', 'csuri-target', 'csversion')");
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-source", "csversion"));
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-target", "csversion"));
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('1', '2', 's-code', 's-ns', 'source-mapping-description')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('2', '3', 't-code', 't-ns', 'target-mapping-description')");
		
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 'a-s-code', " +
				" 'a-s-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		MappingSortOption sort = new MappingSortOption(MappingSortOptionName.SOURCE_CODE, Direction.ASC);

		List<String> uids = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainer(
					"1", 
					"2", 
					"3", 
					"c-name", 
					DaoUtility.mapMappingSortOptionListToSort(Arrays.asList(sort)).getSorts(), 
					0, 
					-1);
		
		assertEquals(2,uids.size());
		assertEquals("2", uids.get(0));
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerSourceEnityCodeSortDesc() throws Exception {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('2', 'sourcecsname', 'csuri-source', 'csversion')");
		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('3', 'targetcsname', 'csuri-target', 'csversion')");

		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-source", "csversion"));
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-target", "csversion"));
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('1', '2', 's-code', 's-ns', 'source-mapping-description')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('2', '3', 't-code', 't-ns', 'target-mapping-description')");
		
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 'a-s-code', " +
				" 'a-s-ns1'," +
				" 'a-t-code1'," +
				" 'a-t-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		MappingSortOption sort = new MappingSortOption(MappingSortOptionName.SOURCE_CODE, Direction.DESC);

		List<String> uids = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainer(
					"1", 
					"2", 
					"3", 
					"c-name", 
					DaoUtility.mapMappingSortOptionListToSort(Arrays.asList(sort)).getSorts(),  
					0, 
					-1);
		
		assertEquals(2,uids.size());
		assertEquals("1", uids.get(0));
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerTargetEnityCodeSortAsc() throws Exception {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('2', 'sourcecsname', 'csuri-source', 'csversion')");
		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('3', 'targetcsname', 'csuri-target', 'csversion')");
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-source", "csversion"));
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-target", "csversion"));
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('1', '2', 's-code', 's-ns', 'source-mapping-description')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('2', '3', 't-code', 't-ns', 'target-mapping-description')");
		
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 'a-t-code'," +
				" 'a-t-ns'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 'a-s-code', " +
				" 'a-s-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		MappingSortOption sort = new MappingSortOption(MappingSortOptionName.TARGET_CODE, Direction.ASC);

		List<String> uids = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainer(
					"1", 
					"2", 
					"3", 
					"c-name", 
					DaoUtility.mapMappingSortOptionListToSort(Arrays.asList(sort)).getSorts(), 
					0, 
					-1);
		
		assertEquals(2,uids.size());
		assertEquals("1", uids.get(0));
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerTargetEnityCodeSortDesc() throws Exception {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('2', 'sourcecsname', 'csuri-source', 'csversion')");
		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('3', 'targetcsname', 'csuri-target', 'csversion')");
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-source", "csversion"));
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-target", "csversion"));
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('1', '2', 's-code', 's-ns', 'source-mapping-description')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('2', '3', 't-code', 't-ns', 'target-mapping-description')");
		
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 'a-t-code'," +
				" 'a-t-ns'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 'a-s-code', " +
				" 'a-s-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		MappingSortOption sort = new MappingSortOption(MappingSortOptionName.TARGET_CODE, Direction.DESC);

		List<String> uids = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainer(
					"1", 
					"2", 
					"3", 
					"c-name", 
					DaoUtility.mapMappingSortOptionListToSort(Arrays.asList(sort)).getSorts(), 
					0, 
					-1);
		
		assertEquals(2,uids.size());
		assertEquals("2", uids.get(0));
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerSourceEnityDescriptionSortAsc() throws Exception {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('2', 'sourcecsname', 'csuri-source', 'csversion')");
		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('3', 'targetcsname', 'csuri-target', 'csversion')");
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-source", "csversion"));
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-target", "csversion"));
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('1', '2', 's-code1', 's-ns1', 'b-source-mapping-description')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('2', '2', 's-code2', 's-ns2', 'a-source-mapping-description')");
	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code1', " +
				" 's-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code2', " +
				" 's-ns2'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		MappingSortOption sort = new MappingSortOption(MappingSortOptionName.SOURCE_ENTITY_DESCRIPTION, Direction.ASC);

		List<String> uids = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainer(
					"1", 
					"2", 
					"3", 
					"c-name", 
					DaoUtility.mapMappingSortOptionListToSort(Arrays.asList(sort)).getSorts(), 
					0, 
					-1);
		
		assertEquals(2,uids.size());
		assertEquals("2", uids.get(0));
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerSourceEnityDescriptionSortDesc() throws Exception {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('2', 'sourcecsname', 'csuri-source', 'csversion')");
		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('3', 'targetcsname', 'csuri-target', 'csversion')");
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-source", "csversion"));
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-target", "csversion"));
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('1', '2', 's-code1', 's-ns1', 'b-source-mapping-description')");
		
		template.execute("Insert into entity (entityGuid, codingSchemeGuid, entityCode, entityCodeNamespace, description) " +
			"values ('2', '2', 's-code2', 's-ns2', 'a-source-mapping-description')");
	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code1', " +
				" 's-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code2', " +
				" 's-ns2'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		MappingSortOption sort = new MappingSortOption(MappingSortOptionName.SOURCE_ENTITY_DESCRIPTION, Direction.DESC);

		List<String> uids = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainer(
					"1", 
					"2", 
					"3", 
					"c-name", 
					DaoUtility.mapMappingSortOptionListToSort(Arrays.asList(sort)).getSorts(),  
					0, 
					-1);
		
		assertEquals(2,uids.size());
		assertEquals("1", uids.get(0));
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerQualifierSortAsc() throws Exception {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('2', 'sourcecsname', 'csuri-source', 'csversion')");
		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('3', 'targetcsname', 'csuri-target', 'csversion')");

		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-source", "csversion"));
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-target", "csversion"));
		
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code1', " +
				" 's-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into " +
				"entityassnquals values ( " +
				"'1', " +
				"'1'," +
				"'qualName'," +
				"'2'," +
				"'1' )");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code2', " +
				" 's-ns2'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into " +
				"entityassnquals values ( " +
				"'2', " +
				"'2'," +
				"'qualName'," +
				"'1'," +
				"'2' )");
		
		MappingSortOption sort = new QualifierSortOption(Direction.ASC, "qualName");

		List<String> uids = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainer(
					"1", 
					"2", 
					"3", 
					"c-name", 
					DaoUtility.mapMappingSortOptionListToSort(Arrays.asList(sort)).getSorts(),  
					0, 
					-1);
		
		assertEquals(2,uids.size());
		assertEquals("2", uids.get(0));
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerQualifierSortDesc() throws Exception {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

			
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('2', 'sourcecsname', 'csuri-source', 'csversion')");
		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('3', 'targetcsname', 'csuri-target', 'csversion')");
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-source", "csversion"));
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-target", "csversion"));

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code1', " +
				" 's-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into " +
				"entityassnquals values ( " +
				"'1', " +
				"'1'," +
				"'qualName'," +
				"'2'," +
				"'1' )");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code2', " +
				" 's-ns2'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into " +
				"entityassnquals values ( " +
				"'2', " +
				"'2'," +
				"'qualName'," +
				"'1'," +
				"'2' )");
		
		MappingSortOption sort = new QualifierSortOption(Direction.DESC, "qualName");

		List<String> uids = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainer(
					"1", 
					"2", 
					"3", 
					"c-name", 
					DaoUtility.mapMappingSortOptionListToSort(Arrays.asList(sort)).getSorts(),  
					0, 
					-1);
		
		assertEquals(2,uids.size());
		assertEquals("1", uids.get(0));
	}
	
	@Test
	public void testGetTriplesForMappingRelationsCount() throws Exception {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('2', 'sourcecsname', 'csuri-source', 'csversion')");
		
		template.execute("Insert into codingScheme (codingSchemeGuid, codingSchemeName, codingSchemeUri, representsVersion) " +
			"values ('3', 'targetcsname', 'csuri-target', 'csversion')");

		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-source", "csversion"));
		
		registry.addNewItem(RegistryUtility.codingSchemeToRegistryEntry("csuri-target", "csversion"));
		
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code1', " +
				" 's-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into " +
				"entityassnquals values ( " +
				"'1', " +
				"'1'," +
				"'qualName'," +
				"'2'," +
				"'1' )");
		
		template.execute("insert into " +
				"entityassnquals values ( " +
				"'2', " +
				"'1'," +
				"'qualName2'," +
				"'22'," +
				"'2' )");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code2', " +
				" 's-ns2'," +
				" 't-code2'," +
				" 't-ns2'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into " +
				"entityassnquals values ( " +
				"'3', " +
				"'2'," +
				"'qualName'," +
				"'1'," +
				"'3' )");
		
		int count = 
			ibatisCodedNodeGraphDao.getTriplesForMappingRelationsContainerCount(
					"1", 
					"c-name");
		
		assertEquals(2,count);
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerAndCodesWithOne() {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 'a-s-code', " +
				" 'a-s-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		ConceptReference ref = new ConceptReference();
		ref.setCode("s-code");
		
		List<ConceptReference> refList = Arrays.asList(ref);

		int count = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainerAndCodes(
					"1", 
					"c-name", 
					refList,
					null,
					null
					).size();
		
		assertEquals(1,count);
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerAndCodesWithOneSourceAndTarget() {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 'a-s-code', " +
				" 'a-s-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		ConceptReference ref1 = new ConceptReference();
		ref1.setCode("s-code");
		
		ConceptReference ref2 = new ConceptReference();
		ref2.setCode("t-code");
		
		List<ConceptReference> refList = Arrays.asList(ref1,ref2);

		int count = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainerAndCodes(
					"1", 
					"c-name", 
					refList,
					refList,
					null
					).size();
		
		assertEquals(1,count);
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerAndCodesWithOneSourceAndTargetAndOrSource(){
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());
	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 'a-s-code', " +
				" 'a-s-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		ConceptReference ref1 = new ConceptReference();
		ref1.setCode("s-code");
		
		ConceptReference ref2 = new ConceptReference();
		ref2.setCode("t-code");
		
		ConceptReference ref3 = new ConceptReference();
		ref3.setCode("s-code");
		
		List<ConceptReference> refList = Arrays.asList(ref1,ref2);
		
		List<ConceptReference> orList = Arrays.asList(ref3);

		int count = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainerAndCodes(
					"1", 
					"c-name", 
					refList,
					refList,
					orList
					).size();
		
		assertEquals(1,count);
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerAndCodesWithOneSourceAndTargetAndOrTarget(){
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 'a-s-code', " +
				" 'a-s-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		ConceptReference ref1 = new ConceptReference();
		ref1.setCode("s-code");
		
		ConceptReference ref2 = new ConceptReference();
		ref2.setCode("t-code");
		
		ConceptReference ref3 = new ConceptReference();
		ref3.setCode("t-code");
		
		List<ConceptReference> refList = Arrays.asList(ref1,ref2);
		
		List<ConceptReference> orList = Arrays.asList(ref3);

		int count = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainerAndCodes(
					"1", 
					"c-name", 
					refList,
					refList,
					orList
					).size();
		
		assertEquals(1,count);
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerAndCodesWithOneSourceAndTargetAndOrInvalid(){
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());
	
		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 'a-s-code', " +
				" 'a-s-ns1'," +
				" 't-code1'," +
				" 't-ns1'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		ConceptReference ref1 = new ConceptReference();
		ref1.setCode("s-code");
		
		ConceptReference ref2 = new ConceptReference();
		ref2.setCode("t-code");
		
		ConceptReference ref3 = new ConceptReference();
		ref3.setCode("___INVALID___");
		
		List<ConceptReference> refList = Arrays.asList(ref1,ref2);
		
		List<ConceptReference> orList = Arrays.asList(ref3);

		int count = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainerAndCodes(
					"1", 
					"c-name", 
					refList,
					refList,
					orList
					).size();
		
		assertEquals(0,count);
	}
	
	@Test
	public void testGetTripleUidsForMappingRelationsContainerAndCodesWithTwo() {
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());

		template.execute("insert into " +
				"relation (relationGuid, codingSchemeGuid, containerName) " +
		"values ('1', '1', 'c-name')");
		
		template.execute("insert into " +
				"associationpredicate (associationPredicateGuid," +
				"relationGuid, associationName) values " +
				"('1', '1', 'apname')");
		
		template.execute("insert into entityassnstoentity" +
				" values ('1'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 't-code'," +
				" 't-ns'," +
		" 'ai-id1', null, null, null, null, null, null, null, null)");
		
		template.execute("insert into entityassnstoentity" +
				" values ('2'," +
				" '1'," +
				" 's-code', " +
				" 's-ns'," +
				" 'some-other-code'," +
				" 'some-other-namespace'," +
		" 'ai-id2', null, null, null, null, null, null, null, null)");
		
		ConceptReference ref = new ConceptReference();
		ref.setCode("s-code");
		
		List<ConceptReference> refList = Arrays.asList(ref);

		int count = 
			ibatisCodedNodeGraphDao.getTripleUidsForMappingRelationsContainerAndCodes(
					"1",  
					"c-name", 
					refList,
					null,
					null
					).size();
		
		assertEquals(2,count);
	}
}