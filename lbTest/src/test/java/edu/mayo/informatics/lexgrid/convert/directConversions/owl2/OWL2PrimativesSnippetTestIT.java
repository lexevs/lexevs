package edu.mayo.informatics.lexgrid.convert.directConversions.owl2;

import java.util.Iterator;


import org.LexGrid.LexBIG.DataModel.Collections.NameAndValueList;
import org.LexGrid.LexBIG.DataModel.Collections.ResolvedConceptReferenceList;
import org.LexGrid.LexBIG.DataModel.Core.AssociatedConcept;
import org.LexGrid.LexBIG.DataModel.Core.Association;
import org.LexGrid.LexBIG.DataModel.Core.NameAndValue;
import org.LexGrid.LexBIG.DataModel.Core.ResolvedConceptReference;
import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Exceptions.LBInvocationException;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.LexBIG.Exceptions.LBResourceUnavailableException;
import org.LexGrid.LexBIG.Impl.function.LexBIGServiceTestCase;
import org.LexGrid.LexBIG.Utility.Constructors;
import org.LexGrid.LexBIG.Utility.Iterators.ResolvedConceptReferencesIterator;
import org.junit.Test;

public class OWL2PrimativesSnippetTestIT extends DataLoadTestBaseSnippet2 {

	public OWL2PrimativesSnippetTestIT() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void testAssocURIAnnotationLoadAlpha() throws LBInvocationException, LBParameterException {
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("AssociationURI"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(Constructors.createConceptReference("HappyPatientDrivingAround", LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("PrognosisGood", itr));
		}
		
	@Test
	public void testAssocURIAnnotationLoadBeta() throws LBInvocationException, LBParameterException {
		NameAndValueList nvlist = new NameAndValueList();
		NameAndValue nv = new NameAndValue();
		nv.setName("note");
		nv.setContent("annotation on an AssociationURI.");
		nvlist.addNameAndValue(nv);
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("AssociationURI"), nvlist);
		ResolvedConceptReferenceList list = cngp.resolveAsList(Constructors.createConceptReference("HappyPatientDrivingAround", LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("PrognosisGood", itr));
		}
	
	public void testEquivalentClassAnonLoad() throws LBInvocationException, LBParameterException {
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("patient_has_finding"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(Constructors.createConceptReference("CancerPatient", LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("TumorBenign", itr));
		}
	
	@Test
	public void testForDuplicateAssociations() throws LBInvocationException, LBParameterException{
		boolean foundIndividual = false;
		//TODO insure these duplicate associations are correct.  If not uncomment this and correct it as necessary.  
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("AssociationV1"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(Constructors.createConceptReference("HappyPatientDrivingAround", LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		if(itr.hasNext()){
			ResolvedConceptReference ref = itr.next();
			Association[] assocs = ref.getSourceOf().getAssociation();
			for(Association assoc : assocs){
				if(assoc.getAssociatedConcepts().getAssociatedConceptCount() > 1){
				AssociatedConcept[] concepts = assoc.getAssociatedConcepts().getAssociatedConcept();

				for(AssociatedConcept con: concepts){
					if(con.getEntity().getEntityType(0).equals("instance"))
					{
						foundIndividual = true;
						break;
					}
				}
				assertTrue(foundIndividual);
				assertNotSame(concepts[0].getCode(),concepts[1].getCode());
				}
			}
		}
	}
	
	@Test
	public void testAssocLoadingDisjointWith_LEXEVS_685() throws LBInvocationException, LBParameterException {
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("disjointWith"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(Constructors.createConceptReference("Person", LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("DiseasesDisordersFindings", itr));
		}
	
	@Test
	public void testSubClassOfExternalNamedClass() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("EpithelialCell", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("http://purl.obolibrary.org/obo/CL_000000", itr));
	}
	
	@Test
	public void testAssociationExternalClassSTR() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("AssociationSTR"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("HappyPatientWalkingAround", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("http://purl.obolibrary.org/obo/CL_0000148", itr));
	}
	
	@Test
	public void testAssociationExternalClassV1() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("AssociationV1"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("HappyPatientWalkingAround", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("http://purl.obolibrary.org/obo/CL_0000148", itr));
	}
	
	@Test
	public void testAssociationExternalClassURI() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("AssociationURI"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("HappyPatientWalkingAround", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("http://purl.obolibrary.org/obo/CL_0000148", itr));
	}
	
	@Test
	public void testAssociationExternalClassLIT() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("AssociationLIT"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("HappyPatientWalkingAround", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("http://purl.obolibrary.org/obo/CL_0000148", itr));
	}
	
	
	
	@Test
	public void testEquivalentClassIntersectionNamedClass() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("TotalPerson", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("Person", itr));
	}
	
	@Test
	public void testEquivalentClassIntersectionNamedClassAnd() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("TotalPerson", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("PersonRole", itr));
	}
	
	@Test
	public void testEquivalentClassUnionNamedDisjointUnionClass1st() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("disjointUnionOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("C123", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("BRaf", itr));
	}
	
	@Test
	public void testEquivalentClassUnionNamedDisjointUnionClass2nd() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("disjointUnionOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("C123", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("Erbb2", itr));
	}
	
	@Test
	public void testEquivalentClassUnionNamedDisjointUnionClass3rd() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("disjointUnionOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("C123", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("Mefv", itr));
	}
	
	@Test
	public void testEquivalentClassUnionNamedDisjointUnionClass4th() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("disjointUnionOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("C123", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("SOS", itr));
	}
	
	@Test
	public void testEquivalentClassUnionNamedDisjointUnionClass5th() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("disjointUnionOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("C123", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("actin", itr));
	}
	
	@Test
	public void testEquivalentClassUnionNamedDisjointUnionClass6th() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("disjointUnionOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("C123", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("SHH", itr));
	}
	
	@Test
	public void testEquivalentClassUnionNamedDisjointUnionClass7th() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("disjointUnionOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("C123", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("Ras", itr));
	}
	
	@Test
	public void testEquivalentClassUnionNamedDisjointUnionClass8th() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("disjointUnionOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("C123", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("k-Ras", itr));
	}
	
	@Test
	public void testEquivalentComplementNamedclass() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("not"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("HealthyPatient", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("SickPatient", itr));
	}
	
	@Test
	public void testEquivalentClassOneOf() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("Finding", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("Gene", itr));
	}
	
	@Test
	public void testEquivalentClassOneOfFirst() 
			throws LBInvocationException, LBParameterException, LBResourceUnavailableException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("equivalentClass"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("Finding", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("Fever", itr));
	}
	
	@Test
	public void testEquivalentClassOneOfSecond() 
			throws LBInvocationException, LBParameterException, LBResourceUnavailableException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("equivalentClass"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("Finding", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("PaleSkin", itr));
	}
	
	@Test
	public void testEquivalentClassOneOfThird() 
			throws LBInvocationException, LBParameterException, LBResourceUnavailableException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("equivalentClass"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("Finding", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("ShallowBreathing", itr));
	}
	@Test
	public void testEquivalentClassSomeDatatypeRestriction() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("Ras", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("Gene", itr));
	}
	
	@Test
	public void testClassSomeDatatypeRestrictionAnd() 
			throws LBInvocationException, LBParameterException, LBResourceUnavailableException{
	cnsp = cnsp.restrictToCodes(Constructors.createConceptReferenceList("positiveInteger"));
	ResolvedConceptReferencesIterator rcri = cnsp.resolve(null, null, null);
	assertNotNull(rcri);
	assertTrue(rcri.hasNext());
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("has_physical_location"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("Ras", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("postiveInteger", itr));
	}
	
	
	@Test
	public void testEquivalentClassAllDatatypeRestriction() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("k-Ras", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("Gene", itr));
	}
	
	@Test
	public void testClassAllDatatypeRestrictionAnd() 
			throws LBInvocationException, LBParameterException, LBResourceUnavailableException{
	cnsp = cnsp.restrictToCodes(Constructors.createConceptReferenceList("positiveInteger"));
	ResolvedConceptReferencesIterator rcri = cnsp.resolve(null, null, null);
	assertNotNull(rcri);
	assertTrue(rcri.hasNext());
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("has_physical_location"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("k-Ras", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("postiveInteger", itr));
	}
	
	@Test
	public void testEquivalentDatatypeHasValue() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("OncogeneTim", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("Gene", itr));
	}
	
	@Test
	public void testEquivalentDatatypeHasValueAnd() 
			throws LBInvocationException, LBParameterException, LBResourceUnavailableException{
	cnsp = cnsp.restrictToCodes(Constructors.createConceptReferenceList("1234"));
	ResolvedConceptReferencesIterator rcri = cnsp.resolve(null, null, null);
	assertNotNull(rcri);
	assertTrue(rcri.hasNext());
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("has_physical_location"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("OncogeneTim", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("12345", itr));
	}
	
	@Test
	public void testEquivalentClassSomeObjectTypeRestriction() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("SOS", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("Gene", itr));
	}
	
	@Test
	public void testEquivalentClassSomeObjectTypeRestrictionAnd() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("gene_related_to_disease"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("SOS", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("NeoplasticDisease", itr));
	}
	
	@Test
	public void testEquivalentClassSomeObjectTypeRestrictionExternalClass() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("BRaf", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("Gene", itr));
	}
	
	@Test
	public void testEquivalentClassSomeObjectTypeRestrictionExternalClassAnd() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("gene_expressed_in"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("BRaf", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("http://purl.obolibrary.org/obo/CL_0000148", itr));
	}
	
	@Test
	public void testEquivalentClassAllObjectTypeRestrictionExternalClass() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("Erbb2", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("Gene", itr));
	}
	
	@Test
	public void testEquivalentClassAllObjectTypeRestrictionExternalClassAnd() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("gene_expressed_in"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("Erbb2", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("http://purl.obolibrary.org/obo/CL_0000148", itr));
	}
	
	@Test
	public void testEquivalentClassAllObjectTypeRestriction() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("SHH", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("Gene", itr));
	}
	
	@Test
	public void testEquivalentClassAllObjectTypeRestrictionAnd() 
			throws LBInvocationException, LBParameterException{
	cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("gene_related_to_disease"), null);
	ResolvedConceptReferenceList list = cngp.resolveAsList(
			Constructors.createConceptReference("SHH", 
					LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
			true, true, 1, 1, null, null, null, null, -1);
	Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
	assertTrue(validateTarget("NeoplasticDisease", itr));
	}
	
	@Test
	public void testEquivalentClassObjectHasValue() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("Mefv", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("Gene", itr));
	}
	
	public void testEquivalentClassObjectHasValueAnd() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("gene_related_to_disease"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("Mefv", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("Fever", itr));
	}
	
	@Test
	public void testEquivalentClassIntersectionObjectRestrictionsAnd() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("MildlySickCancerPatient", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("MildlySickPatient", itr));
	}
	
	
	@Test
	public void testEquivalentClassIntersectionObjectRestrictions2ndAnd() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("patient_has_finding"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("MildlySickCancerPatient", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("TumorBenign", itr));
	}
	
	@Test
	public void testEquivalentClassIntersectionObjectRestrictions3ndAnd() 
			throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("patient_has_prognosis"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("MildlySickCancerPatient", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("PrognosisGood", itr));
	}
	
	@Test
	public void testEquivalentClassUnionObjectRestrictionsAnd() throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("VerySickCancerPatient", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("VerySickPatient", itr));
	}
	
	@Test
	public void testEquivalentClassUnionObjectRestrictions1stOr() throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("patient_has_prognosis"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("VerySickCancerPatient", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("PrognosisBad", itr));
	}
	
	@Test
	public void testEquivalentClassUnionObjectRestrictions2ndOr() throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("patient_has_finding"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("VerySickCancerPatient", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("TumorMalignant", itr));
	}
	
	@Test
	public void testEquivalentClassRoleGroup1stAnd() throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("subClassOf"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("CancerPatient", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("SickPatient", itr));
	}
	
	@Test
	public void testEquivalentClassRoleGroup2ndAnd() throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("patient_has_prognosis"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(Constructors.createConceptReference("CancerPatient", LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("PrognosisGood", itr));
	}
	
	@Test
	public void testEquivalentClassRoleGroup3rdAnd() throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("patient_has_prognosis"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(Constructors.createConceptReference("CancerPatient", LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("PrognosisBad", itr));
	}
	
	@Test
	public void testEquivalentClassRoleGroup4thAnd() throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("patient_has_finding"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(Constructors.createConceptReference("CancerPatient", LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("TumorBenign", itr));
	}
	
	@Test
	public void testEquivalentClassRoleGroup5thAnd() throws LBInvocationException, LBParameterException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("patient_has_finding"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(Constructors.createConceptReference("CancerPatient", LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("TumorMalignant", itr));
	}
	
	
	
	@Test
	public void testUnionObjectAndDataTypeFirstOr() throws LBException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("gene_expressedin"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("actin", LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("EpithelialCell", itr));
		assertTrue(validateQualifier("EpithelialCell", "some", itr));
	}
	
	@Test
	public void testUnionObjectAndDataType2ndOr() throws LBException{
		cnsp = cnsp.restrictToCodes(Constructors.createConceptReferenceList("homo sapiens"));
		ResolvedConceptReferencesIterator rcri = cnsp.resolve(null, null, null);
		assertNotNull(rcri);
		assertTrue(rcri.hasNext());
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("in_organism"), null);
		ResolvedConceptReferenceList list1 = cngp.resolveAsList(
				Constructors.createConceptReference("actin", LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr1 = list1.iterateResolvedConceptReference();
		assertTrue(validateTarget("homo sapiens", itr1));
		assertTrue(validateQualifier("homo sapiens", "value", itr1));
	}
	
	@Test
	public void testIntersectionObjectAndDatatype1stAnd() throws LBException{
		cngp = cngp.restrictToAssociations(Constructors.createNameAndValueList("gene_expressedin"), null);
		ResolvedConceptReferenceList list = cngp.resolveAsList(
				Constructors.createConceptReference("Brca1", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr = list.iterateResolvedConceptReference();
		assertTrue(validateTarget("EpithelialCell", itr));
		assertTrue(validateQualifier("EpithelialCell", "some", itr));
	}
	
	@Test
	public void testIntersectionObjectAndDatatype2ndAnd() throws LBException{
		cnsp = cnsp.restrictToCodes(Constructors.createConceptReferenceList("all organisms"));
		ResolvedConceptReferencesIterator rcri = cnsp.resolve(null, null, null);
		assertNotNull(rcri);
		assertTrue(rcri.hasNext());
		cngp = cngp.restrictToAssociations(
				Constructors.createNameAndValueList("in_organism"), null);
		ResolvedConceptReferenceList list1 = cngp.resolveAsList(
				Constructors.createConceptReference("Brca1", 
						LexBIGServiceTestCase.OWL2_SNIPPET_INDIVIDUAL_URN), 
				true, true, 1, 1, null, null, null, null, -1);
		Iterator<? extends ResolvedConceptReference> itr1 = list1.iterateResolvedConceptReference();
		assertTrue(validateTarget("all organisms", itr1));
		assertTrue(validateQualifier("all organisms", "value", itr1));
	}
	

}
