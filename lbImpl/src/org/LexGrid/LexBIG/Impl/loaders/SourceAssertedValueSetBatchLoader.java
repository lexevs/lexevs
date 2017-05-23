package org.LexGrid.LexBIG.Impl.loaders;

import java.util.ArrayList;
import java.util.List;

import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.concepts.Entity;
import org.LexGrid.valueSets.ValueSetDefinition;
import org.lexevs.dao.database.access.association.model.Node;
import org.lexevs.dao.database.service.codednodegraph.CodedNodeGraphService;
import org.lexevs.dao.database.service.codingscheme.CodingSchemeService;
import org.lexevs.dao.database.service.entity.EntityService;
import org.lexevs.dao.database.service.valuesets.ValueSetDefinitionService;
import org.lexevs.locator.LexEvsServiceLocator;
import org.lexevs.registry.service.Registry;
import org.lexevs.system.service.SystemResourceService;

import edu.mayo.informatics.lexgrid.convert.directConversions.assertedValueSets.EntityToVSDTransformer;

public class SourceAssertedValueSetBatchLoader {
    
    private CodedNodeGraphService codedNodeGraphDao;
    private EntityService entityService;
    private CodingSchemeService csService;
    private SystemResourceService resourceService;
    private Registry registry;
    private String codingSchemeUri;
    private String codingSchemeVersion;
    private String associationName;
    private boolean targetToSource;
    private EntityToVSDTransformer transformer;
    private ValueSetDefinitionService valueSetDefinitionService;
    
    
    
    
    public SourceAssertedValueSetBatchLoader(String codingScheme, String version, 
            String associationName, boolean targetToSource, String baseUri, String owner) throws LBParameterException{
        codedNodeGraphDao = LexEvsServiceLocator.getInstance().
                getDatabaseServiceManager().getCodedNodeGraphService();
        entityService = LexEvsServiceLocator.getInstance().
                getDatabaseServiceManager().getEntityService();
        csService = LexEvsServiceLocator.getInstance().
                getDatabaseServiceManager().getCodingSchemeService();
        resourceService = LexEvsServiceLocator.getInstance().getSystemResourceService();
        registry = LexEvsServiceLocator.getInstance().getRegistry();
        this.codingSchemeUri = resourceService.getUriForUserCodingSchemeName(codingScheme, version);
        valueSetDefinitionService = LexEvsServiceLocator.getInstance().getDatabaseServiceManager().getValueSetDefinitionService();
        this.codingSchemeVersion = version;
        this.associationName = associationName;
        this.targetToSource = targetToSource;
        this.transformer = new EntityToVSDTransformer(baseUri, codingScheme, version, owner, associationName);
    }
    
    
    protected List<Node> getEntitiesForAssociation(String association, String codingSchemeUri,String version){
       String associationPredicateUid = this.getPredicateGuidForValueSetRelation(association, codingSchemeUri, version);
       return codedNodeGraphDao.getDistinctTargetTriples(codingSchemeUri, version, associationPredicateUid);
    }
    
    protected String getPredicateGuidForValueSetRelation(String associationName, String codingSchemeUri,
            String codingSchemeVersion){
        List<String> list = new ArrayList<String>();
        list.add(associationName);
        List<String> uids = codedNodeGraphDao.getAssociationPredicateUidsForNames(
                codingSchemeUri, codingSchemeVersion, null, list);
        if( uids == null || uids.size() < 1){
            throw new RuntimeException("No association is asserted for :" 
        + associationName + " in " + codingSchemeUri + ":" + codingSchemeVersion);
        }
        return uids.get(0);
    }
    
    
    protected Entity getEntityByCodeAndNamespace(String codingSchemeUri, String version, String code, String namespace){
        Entity entity = entityService.getEntity(codingSchemeUri, version, code, namespace);
        return entity;
    }
    
    public void processEntitiesToCodingScheme(List<Node> nodes, String sourceName) throws LBException{
       for(Node n: nodes){
           Entity e = getEntityByCodeAndNamespace(codingSchemeUri, 
                   codingSchemeVersion, n.getEntityCode(), n.getEntityCodeNamespace());
           List<ValueSetDefinition> defs = transformer.transformEntityToValueSetDefinitions(e, sourceName);
           for(ValueSetDefinition d : defs){
               valueSetDefinitionService.insertValueSetDefinition(d, null, d.getMappings());
           }
       }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }


    public void register() {
        // TODO Auto-generated method stub
        
    }

}
