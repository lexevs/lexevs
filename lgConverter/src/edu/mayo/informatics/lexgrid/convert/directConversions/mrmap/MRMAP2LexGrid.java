package edu.mayo.informatics.lexgrid.convert.directConversions.mrmap;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.LexGrid.LexBIG.Exceptions.LBRevisionException;
import org.LexGrid.LexBIG.Utility.logging.LgMessageDirectorIF;
import org.LexGrid.codingSchemes.CodingScheme;
import org.LexGrid.commonTypes.EntityDescription;
import org.LexGrid.commonTypes.Properties;
import org.LexGrid.commonTypes.Property;
import org.LexGrid.commonTypes.Text;
import org.LexGrid.naming.Mappings;
import org.LexGrid.naming.SupportedAssociation;
import org.LexGrid.naming.SupportedCodingScheme;
import org.LexGrid.naming.SupportedContainerName;
import org.LexGrid.naming.SupportedNamespace;
import org.LexGrid.relations.AssociationData;
import org.LexGrid.relations.AssociationPredicate;
import org.LexGrid.relations.AssociationQualification;
import org.LexGrid.relations.AssociationSource;
import org.LexGrid.relations.AssociationTarget;
import org.LexGrid.relations.Relations;
import org.LexGrid.versions.ChangedEntry;
import org.LexGrid.versions.Revision;
import org.lexevs.dao.database.service.DatabaseServiceManager;
import org.lexevs.dao.database.service.version.AuthoringService;
import org.lexevs.locator.LexEvsServiceLocator;

public class MRMAP2LexGrid {
    //services
    AuthoringService service;
    DatabaseServiceManager dbManager;
    
    private List<String> propertyNames;
    private String mapPath;
    private String satPath;
    private LgMessageDirectorIF messages_;
    boolean mapMrSat;
    boolean isNewMapping = false;
    private String currentMapping = null;
    private HashSet<String> sources;
   // private AssociationSource[] sourcesAndTargets;
    
    //Supported Attribute Values
    private String nameForMappingScheme;
    private String nameForMappingVersion;
    private String nameforMappingURI;
    private String sourceScheme;
    private String sourceVersion;
    private String sourceURI;
    private String targetScheme;
    private String targetVersion;
    private String targetURI;

    
    //constants
    public static final String ASSOC_NAME = "mapped_to";
    public static final String APROX_ASSOC_NAME = "approximately_mapped_to";
    public static final boolean ISMAP = true;
    public static final String URIPREFIX = "urn:oid";
    
    //relations constants
    public static final String TORSAB = "TORSAB";
    public static final String TOVSAB = "TOVSAB";
    public static final String FROMRSAB =  "FROMRSAB";
    public static final String FROMVSAB = "FROMVSAB";
    public static final String MAPSETVERSION =  "MAPSETVERSION";
    public static final String SOS = "SOS";
    public static final String MAPSETNAME = "MAPSETNAME";

    //coding scheme constants
    public static final String CODING_SCHEME_NAME = "MappingCodingScheme";
    public static final String CODING_SCHEME_URI = "http://does.not.resolve";
    public static final String REPRESENTS_VERSION = "1.0";
    
    public MRMAP2LexGrid(
            LgMessageDirectorIF messages,
            String mrSatPath, String mrMapPath){
        this(
                messages,
                 mrSatPath,
                 mrMapPath,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null);
    }
    
    public MRMAP2LexGrid(
            LgMessageDirectorIF messages,
            String mrSatPath, String mrMapPath,
            String sourceCodingScheme, String sourceVersion, String sourceURI, 
            String targetCodingScheme, String targetVersion, String targetURI){
        this(
                messages,
                 mrSatPath,
                 mrMapPath,
                null,
                null,
                null,
                sourceCodingScheme,
                sourceVersion,
                sourceURI,
                targetCodingScheme,
                targetVersion,
                targetURI);
    }
    public MRMAP2LexGrid(
        LgMessageDirectorIF messages,
        String mrSatPath, String mrMapPath,
        String nameForMappingScheme,
        String nameForMappingVersion,
        String nameforMappingURI,
        String sourceScheme,
        String sourceVersion,
        String sourceURI,
        String targetScheme,
        String targetVersion,
        String targetURI){
        messages_ = messages;
        sources = new HashSet<String>();
        propertyNames = Arrays.asList(new String[]{
        	"MAPSETGRAMMER",
            "MAPSETRSAB",
            "MAPSETTYPE",
            "MAPSETVSAB",
            "MTH_MAPFROMEXHAUSTIVE",
            "MTH_MAPSETCOMPLEXITY",
            "MTH_MAPTOEXHAUSTIVE",
            "MTH_MAPFROMCOMPLEXITY", 
            "MTH_MAPTOCOMPLEXITY",
            "MR","DA","ST"});
        mapPath = mrMapPath;
        satPath = mrSatPath;
        this.nameForMappingScheme = nameForMappingScheme;
        this.nameForMappingVersion = nameForMappingVersion;
        this.nameforMappingURI = nameforMappingURI;
        this.sourceScheme = sourceScheme;
        this.sourceVersion = sourceVersion;
        this.sourceURI = sourceURI;
        this.targetScheme = targetScheme;
        this.targetVersion = targetVersion ;
        this.targetURI = targetURI;
        LexEvsServiceLocator locator = LexEvsServiceLocator.getInstance();
        dbManager = locator.getDatabaseServiceManager();
        service = dbManager.getAuthoringService();
    }

    public CodingScheme loadToRevision() throws LBRevisionException{
       CodingScheme scheme = processMrMapToLexGrid();
       CodingScheme schemeToReturn = new CodingScheme();
       schemeToReturn.setCodingSchemeName(scheme.getCodingSchemeName());
       schemeToReturn.setRepresentsVersion(scheme.getRepresentsVersion());
       schemeToReturn.setCodingSchemeURI(scheme.getCodingSchemeURI());
        service.loadRevision(scheme, null, true);
        return schemeToReturn;
    }
    public CodingScheme processMrMapToLexGrid() {

        Relations rel = null;
        
        try {
        rel = processMrSatBean(satPath);
        rel.addAssociationPredicate(processMrMapBean(mapPath, rel.getSourceCodingScheme(), rel.getTargetCodingScheme()));
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        CodingScheme scheme = createMrMapScheme(rel,
        nameForMappingScheme,
        nameForMappingVersion,
        nameforMappingURI,
        sourceScheme,
        sourceVersion,
        sourceURI,
        targetScheme,
        targetVersion,
        targetURI);
        return scheme;
    }
    
    
    protected Relations processMrSatBean(String path) throws SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException, FileNotFoundException {
        RRFLineReader satReader = new RRFLineReader(path);
        String[] mrSatRow;
        Relations relation = new Relations();
        try {
            while((mrSatRow = satReader.readRRFLine()) != null){
                MrSat metaData = processMrSatRow(mrSatRow);
               processMrSatToRelation(metaData, relation);
            }
            satReader.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
        return relation;
    }

    protected void processMrSatToRelation(MrSat metaData, Relations relation) {
        
        if(relation.getProperties() == null){
            Properties properties = new Properties();
            relation.setProperties(properties);
        }
        if(relation.getContainerName() == null){
            relation.setContainerName(metaData.getCui());
        }
        if(relation.getOwner() == null){
            relation.setOwner(metaData.getSab());
        }
        if(relation.getIsMapping() == null){
        relation.setIsMapping(ISMAP);}
        String atnValue = metaData.getAtn();
        if(propertyNames.contains(atnValue)){
            Property prop = new Property();
            prop.setPropertyName(metaData.getAtn());
            Text value = new Text();
            value.setContent(metaData.getAtv());
            prop.setValue(value);
            relation.getProperties().addProperty(prop);
        }
        if(atnValue.equals(TORSAB)){
            relation.setTargetCodingScheme(metaData.getAtv());
        }
        if(atnValue.equals(TOVSAB)){
            relation.setTargetCodingSchemeVersion(metaData.getAtv());
        }
        if(atnValue.equals(FROMRSAB)){
            relation.setSourceCodingScheme(metaData.getAtv());
        }
        if(atnValue.equals(FROMVSAB)){
            relation.setSourceCodingSchemeVersion(metaData.getAtv());
        }
        if(atnValue.equals(MAPSETVERSION)){
            relation.setRepresentsVersion(metaData.getAtv());
        }
        if(atnValue.equals(SOS) || atnValue.equals(MAPSETNAME)){
            EntityDescription entityDescription = new EntityDescription();
            entityDescription.setContent(metaData.getAtv());
            relation.setEntityDescription(entityDescription);
        }
    }
    
    //TODO create JUnit
    protected AssociationPredicate processMrMapBean(String path, String sourceSchemeNamespace, String targetSchemeNamespace) throws Exception {
        String[] mrMapRow;
        RRFLineReader mapReader = new RRFLineReader(path);
        AssociationPredicate predicate  = createAssociationPredicate();

            try {
                while((mrMapRow = mapReader.readRRFLine()) != null){
                    
                    MrMap map = processMrMapRow(mrMapRow);
                    currentMapping = map.getMapsetcui();
                    if (currentMapping != null && !map.getMapsetcui().equals(currentMapping)){
                        break;
                    }
               processAndMergeIntoSource(map, predicate, sourceSchemeNamespace, targetSchemeNamespace);

                }
                mapReader.close();
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }   
     
            return predicate;
    }
    
    private AssociationPredicate processAndMergeIntoSource(MrMap map, AssociationPredicate predicate, String sourceEntityCodeNamespace, String targetEntityCodeNamespace) throws Exception {

        if(sources.add(map.getFromid())){
           AssociationSource source = createNewAssociationSourceWithTarget(map,targetEntityCodeNamespace);
           source.setSourceEntityCodeNamespace(sourceEntityCodeNamespace);
           predicate.addSource(source);
           return predicate;
        }
        else{
    
            return addTargetToExistingSource(map, predicate, sourceEntityCodeNamespace,targetEntityCodeNamespace);
        }
       
    }

    private AssociationPredicate createAssociationPredicate() {
        AssociationPredicate predicate  = new AssociationPredicate();
        predicate.setAssociationName(ASSOC_NAME);
        return predicate;
    }
    
    protected AssociationSource createNewAssociationSourceWithTarget(MrMap map, String targetEntityCodeNamespace) throws Exception {
    AssociationSource source = new AssociationSource();
    source.setSourceEntityCode(map.getFromid());
    source.addTargetData(createTargetData(map));
    source.addTarget(createAssociationTarget(map,targetEntityCodeNamespace));
    return source;
    }
    
   protected AssociationTarget createAssociationTarget(MrMap map, String targetEntityCodeNamespace) throws Exception {
        AssociationTarget target = new AssociationTarget();
        target.setTargetEntityCodeNamespace(targetEntityCodeNamespace);
        target.setAssociationInstanceId(map.getMapid());
        target.setTargetEntityCode(map.getToid());
        target.setAssociationQualification(getAssociationQualifiers(map));
        return target;
    }
    
    protected AssociationData createTargetData(MrMap map) {
        AssociationData data = new AssociationData();
        if(map.getMapid() != null)
        data.setAssociationInstanceId(map.getMapid());
        Text text = new Text();
        text.setContent(map.getToexpr());
        data.setAssociationDataText(text);
        return data;
    }
    
    public List<AssociationQualification> getAssociationQualifiers(MrMap map) throws Exception {
        ArrayList<AssociationQualification> qualifiers = new ArrayList<AssociationQualification>();
        
            Class<?> cl = Class.forName("edu.mayo.informatics.lexgrid.convert.directConversions.mrmap.MrMap");
            Field[] fields = cl.getFields();
           for(Field f: fields){
               AssociationQualification qualifier = new AssociationQualification();
              
               if(f.get(map) != null && f.getName() != "mapsetcui" && f.getName() != "toexpr"){
                   qualifier.setAssociationQualifier(f.getName());
                   Text text = new Text();
                   text.setContent((String)f.get(map));
                   qualifier.setQualifierText(text);
                   qualifiers.add(qualifier);
               }
           }
            
        return qualifiers;
    }

    protected AssociationPredicate addTargetToExistingSource(MrMap map, AssociationPredicate predicate, String sourceEntityCodeNamespace, String targetEntityCodeNamespace) throws IndexOutOfBoundsException, Exception {
     AssociationSource[] sources = predicate.getSource();
     for(AssociationSource s: sources){
         //DEBUG code
         //System.out.println(s.getSourceEntityCode());
        if(s.getSourceEntityCode().equals(map.getFromid())){
            AssociationTarget[] targets = s.getTarget();
            for(AssociationTarget t : targets){
                //only testing for unique code.  name spaces should be equal
                if( t.getTargetEntityCode().equals(map.getToid())){
                messages_.warn("source: " + s.getSourceEntityCode() + " and Target: " + t.getTargetEntityCode() 
                        + "appear to be duplicates, skipping load of this mapping");
                return predicate;
                }
            }
            s.addTarget(createAssociationTarget(map, targetEntityCodeNamespace));
            AssociationData[] data = s.getTargetData();
            for(AssociationData d: data){
               if(d.getAssociationInstanceId().equals(map.getMapid())){
                       messages_.warn("source: " + s.getSourceEntityCode() + " and Target Data: " + d.getAssociationInstanceId() 
                               + "appear to be duplicates, skipping load of this mapping");
                       return predicate;
               }
            }
            s.addTargetData(createTargetData(map));
        }
     }
        return predicate;
    }
    
    
    protected CodingScheme createMrMapScheme(Relations rel, String codingSchemeName, String codingSchemeVersion,
            String codingSchemeURI, String sourceSchemeName, String sourceSchemeVersion, String sourceSchemeURI,
            String targetSchemeName, String targetSchemeVersion, String targetSchemeURI) {
        CodingScheme scheme = new CodingScheme();
        //Create the basics of a mapping Coding Scheme.
        if (codingSchemeName == null) {
            scheme.setCodingSchemeName(CODING_SCHEME_NAME);
        }
        if (codingSchemeVersion == null) {
            scheme.setCodingSchemeURI(CODING_SCHEME_URI);
        }
        if (codingSchemeURI == null) {
            scheme.setRepresentsVersion(REPRESENTS_VERSION);
        }
        //Create a supported version of it for the coding scheme
        SupportedCodingScheme supportedScheme = new SupportedCodingScheme();
        supportedScheme.setContent(scheme.getCodingSchemeName());
        supportedScheme.setLocalId(scheme.getCodingSchemeName());
        supportedScheme.setUri(scheme.getCodingSchemeURI());
        
        SupportedNamespace nameSpace = new SupportedNamespace();
        nameSpace.setContent(scheme.getCodingSchemeName());
        nameSpace.setLocalId(scheme.getCodingSchemeName());
        nameSpace.setUri(scheme.getCodingSchemeURI());
        nameSpace.setEquivalentCodingScheme(scheme.getCodingSchemeName());
        
        //create a supported relations container.
        SupportedContainerName container = new SupportedContainerName();
        container.setContent(rel.getContainerName());
        container.setLocalId(rel.getContainerName());
        
        // Supported source scheme namespace to coding scheme mapping
        SupportedCodingScheme supportedSourceScheme = new SupportedCodingScheme();
        if (sourceSchemeName == null) {
            supportedSourceScheme.setLocalId(rel.getSourceCodingScheme());
            supportedSourceScheme.setContent(rel.getSourceCodingScheme());
            supportedSourceScheme.setUri(URIPREFIX + ":" + rel.getSourceCodingScheme() + ":" + rel.getSourceCodingSchemeVersion());
        } else {
            supportedSourceScheme.setLocalId(sourceSchemeName);
            supportedSourceScheme.setUri(sourceSchemeURI);
            supportedSourceScheme.setContent(sourceSchemeName);
        }

        SupportedNamespace supportedSourceNamespace = new SupportedNamespace();
        supportedSourceNamespace.setLocalId(rel.getSourceCodingScheme());
        if(sourceSchemeURI != null){
            supportedSourceNamespace.setUri(sourceSchemeURI);
        }
        else{
            supportedSourceNamespace.setUri(supportedSourceScheme.getUri());
        }
        supportedSourceNamespace.setContent(rel.getSourceCodingScheme());
        supportedSourceNamespace.setEquivalentCodingScheme(rel.getSourceCodingScheme());
        
        // supported target scheme namespace to coding scheme mapping
        SupportedCodingScheme supportedTargetScheme = new SupportedCodingScheme();
        if (targetSchemeName == null) {
            supportedTargetScheme.setLocalId(rel.getTargetCodingScheme());
            supportedTargetScheme.setContent(rel.getTargetCodingScheme());
            supportedTargetScheme.setUri(URIPREFIX + ":" + rel.getTargetCodingScheme() + ":" + rel.getTargetCodingSchemeVersion());
        }
        else {
            supportedTargetScheme.setLocalId(targetSchemeName);
            supportedTargetScheme.setUri(targetSchemeURI);
            supportedTargetScheme.setContent(targetSchemeName);
        }
        SupportedNamespace supportedTargetNamespace = new SupportedNamespace();
        supportedTargetNamespace.setLocalId(rel.getTargetCodingScheme());
        if (targetSchemeURI != null) {
            supportedTargetNamespace.setUri(targetSchemeURI);
        }
        else{
            supportedTargetNamespace.setUri(supportedTargetScheme.getUri());
        }
        supportedTargetNamespace.setContent(rel.getTargetCodingScheme());
        supportedTargetNamespace.setEquivalentCodingScheme(rel.getTargetCodingScheme());
        
        Mappings mappings = new Mappings();
        mappings.addSupportedCodingScheme(supportedSourceScheme);
        mappings.addSupportedCodingScheme(supportedTargetScheme);
        mappings.addSupportedCodingScheme(supportedScheme);
        
        mappings.addSupportedNamespace(supportedSourceNamespace);
        mappings.addSupportedNamespace(supportedTargetNamespace);
        mappings.addSupportedNamespace(nameSpace);

        SupportedAssociation supportedMapping = new SupportedAssociation();
        supportedMapping.setContent(rel.getAssociationPredicate(0).getAssociationName());
        supportedMapping.setLocalId(rel.getAssociationPredicate(0).getAssociationName());
        mappings.addSupportedAssociation(supportedMapping);
        mappings.addSupportedContainerName(container);
        scheme.setMappings(mappings);
        scheme.addRelations(rel);
        return scheme;
    }


    protected MrMap processMrMapRow(String [] mapRow) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        MrMap mrMap = new MrMap();
        Class<?> mapClass = mrMap.getClass();
        Field[] columns = mapClass.getDeclaredFields();
        for(int i = 0; i < mapRow.length; i++){
            columns[i].set(mrMap, mapRow[i]);
        }
        return mrMap;
    }
    protected MrSat processMrSatRow(String [] mapRow) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        MrSat mrSat = new MrSat();
        Class<?> mapClass = mrSat.getClass();
        Field[] columns = mapClass.getDeclaredFields();
        for(int i = 0; i < mapRow.length; i++){
            columns[i].set(mrSat, mapRow[i]);
        }
        return mrSat;
    }
//    public static void main(String[] args){
//        try {
//           Relations relation = new MRMAP2LexGrid(true, null, null, null).processMrSatBean("../lbTest/resources/testData/mrmap_mapping/MRSAT.RRF");
//           System.out.println(relation.getContainerName());
//           System.out.println(relation.getSourceCodingScheme());
//           System.out.println(relation.getSourceCodingSchemeVersion());
//           System.out.println(relation.getTargetCodingScheme());
//           System.out.println(relation.getTargetCodingSchemeVersion());
//           System.out.println(relation.getRepresentsVersion());
//           System.out.println(relation.getOwner());
//           Properties properties = relation.getProperties();
//           Property[] property = properties.getProperty();
//           for(Property p: property){
//               System.out.println("propertyName:  " + p.getPropertyName());
//               System.out.println("propertyValue:  " + p.getValue().getContent());
//           }
//          
//        } catch (SecurityException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IllegalArgumentException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (NoSuchFieldException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        
//    }
}
