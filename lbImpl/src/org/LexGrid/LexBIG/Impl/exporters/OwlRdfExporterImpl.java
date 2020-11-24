
package org.LexGrid.LexBIG.Impl.exporters;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;

import org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference;
import org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription;
import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.LexBIG.Extensions.Export.OWL_Exporter;
import org.LexGrid.LexBIG.Extensions.Load.options.OptionHolder;
import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.Impl.Extensions.ExtensionRegistryImpl;
import org.LexGrid.LexBIG.Impl.exporters.BaseExporter;
import org.LexGrid.LexBIG.LexBIGService.CodedNodeGraph;
import org.LexGrid.LexBIG.LexBIGService.CodedNodeSet;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.LexBIG.Utility.Constructors;
import org.LexGrid.LexBIG.Utility.logging.LgLoggerIF;
import org.LexGrid.codingSchemes.CodingScheme;
import org.lexevs.logging.LoggerFactory;

//import edu.mayo.informatics.lexgrid.convert.exporters.owlrdf.LexGridToOwlRdfConverter;
import edu.mayo.informatics.lexgrid.convert.exporters.xml.lgxml.constants.LexGridConstants;
import edu.mayo.informatics.lexgrid.convert.options.BooleanOption;

/**
 * Exports content to OWL/RDF format.
 */
public class OwlRdfExporterImpl extends BaseExporter implements OWL_Exporter {

    private static final long serialVersionUID = -97175077552869283L;
    public final static String name = "OwlRdfExporter";
    private final static String description = "This loader exports LexGrid to OWL RDF";

    private CodedNodeGraph cng;
    private CodedNodeSet cns;

    public void setCns(CodedNodeSet cns) {
        this.cns = cns;
    }
    
    public void setCng(CodedNodeGraph cng) {
        this.cng = cng;
    }
    
    
    protected LgLoggerIF getLogger() {
        return LoggerFactory.getLogger();
    }
    
    public OwlRdfExporterImpl() {
        super.name_ = OwlRdfExporterImpl.name;
        super.description_ = OwlRdfExporterImpl.description;
    }

    public static void register() throws LBParameterException, LBException {
        ExtensionDescription temp = new ExtensionDescription();
        temp.setExtensionBaseClass(OwlRdfExporterImpl.class.getInterfaces()[0].getName());
        temp.setExtensionClass(OwlRdfExporterImpl.class.getName());
        temp.setDescription(description);
        temp.setName(name);
        temp.setVersion(version_);

        // I'm registering them this way to avoid the lexBig service manager
        // API.
        // If you are writing an add-on extension, you should register them
        // through the
        // proper interface.
        ExtensionRegistryImpl.instance().registerExportExtension(temp);
    }
    
    protected void doExport() {
        exportCodingSchemeData();
    }
    
    private void verifyOutputDirectory(String directory) {
        if(directory == null) {
            String msg = "Output location value is null.";
            this.getLogger().fatal(msg);
            this.getStatus().setErrorsLogged(true);
            throw new RuntimeException(msg);            
        }
        
        File F_directory = new File(directory);
        
        if(F_directory.exists() == false) {
            String msg = F_directory.getAbsolutePath() + " does not exist.";
            this.getLogger().fatal(msg);
            this.getStatus().setErrorsLogged(true);
            throw new RuntimeException(msg);                        
        }
        
        if(F_directory.isDirectory() == false) {
            String msg = F_directory.getAbsolutePath() + " is not a directory.";
            this.getLogger().fatal(msg);
            this.getStatus().setErrorsLogged(true);
            throw new RuntimeException(msg);                        
        }
    }    
    
    private String getCodingSchemeName(String csUri, String csVersion) {
        String rv = null;
        try {
            CodingScheme cs = LexBIGServiceImpl.defaultInstance().resolveCodingScheme(csUri, 
                    Constructors.createCodingSchemeVersionOrTagFromVersion(csVersion));
            rv = cs.getCodingSchemeName();
        } catch (LBException e) {
            e.printStackTrace();
        }
        return rv;
    }
        
    protected void exportCodingSchemeData(){
        URI destination = super.getResourceUri();
        AbsoluteCodingSchemeVersionReference source = super.getSource();
        
        boolean overwrite = super.getOptions().getBooleanOption(LexGridConstants.OPTION_FORCE).getOptionValue().booleanValue();
        
        // construct out file name
        String separator = File.separator;
        String directory = destination.getPath();
        this.verifyOutputDirectory(directory);
        String outDirWithEndingPathSeparator = directory;
        if(outDirWithEndingPathSeparator.endsWith(separator) == false) {
            outDirWithEndingPathSeparator = outDirWithEndingPathSeparator + separator;
        }
        
        String codingSchemeUri = source.getCodingSchemeURN();
        String codingSchemeVersion = source.getCodingSchemeVersion();
        String codingSchemeName = this.getCodingSchemeName(codingSchemeUri, codingSchemeVersion);
        String outFileName = outDirWithEndingPathSeparator + codingSchemeName + 
                    "_" + codingSchemeVersion + ".owl";  
        
        File outFile = new File(outFileName);
        
        System.out.println("Content will be exported to file: " + outFile.getAbsolutePath());
                
        if(outFile.exists() == true && overwrite == true)
        {
            outFile.delete();
        } else if (outFile.exists() == true && overwrite == false) {
            String msg = "Output file \"" + outFileName + "\" already exists. Set force option to overwrite an existing file.";
            this.getLogger().fatal(msg);
            this.getStatus().setErrorsLogged(true);
            throw new RuntimeException(msg);
        } else {
            // outFile did not exist.  do nothing.
        }
        
        // enter exporter code here
        Writer w = null;
        BufferedWriter out = null;
        LexBIGService lbsvc = null;
        CodingScheme codingScheme = null;
        try {
            w = new FileWriter(outFile, false);
            out = new BufferedWriter(w);

            lbsvc = LexBIGServiceImpl.defaultInstance();
            codingScheme = lbsvc.resolveCodingScheme(codingSchemeUri, 
                                        Constructors.createCodingSchemeVersionOrTagFromVersion(codingSchemeVersion));
            
            cns = lbsvc.getNodeSet(codingSchemeUri, Constructors.createCodingSchemeVersionOrTagFromVersion(codingSchemeVersion),
                    null);

            cng = lbsvc.getNodeGraph(codingSchemeUri,
                    Constructors.createCodingSchemeVersionOrTagFromVersion(codingSchemeVersion), null);
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LBException e) {
            e.printStackTrace();
        }
        
        // cng and cns MUST be set by setter methods
        // call code in lgConverter
        
        LexGridToOwlRdfConverter converter = new LexGridToOwlRdfConverter();
        converter.toTripleStore(codingScheme, cng, cns, out, this.getMessageDirector(), null);
    }

    @Override
    protected OptionHolder declareAllowedOptions(OptionHolder holder) {
       holder.setIsResourceUriFolder(true);
       holder.getBooleanOptions().add(new BooleanOption(LexGridConstants.OPTION_FORCE, (new Boolean(false))));
       return holder;
    }

    @Override
    public OptionHolder getOptions() {
        return super.getOptions();
    }

    @Override
    public void export(AbsoluteCodingSchemeVersionReference source, URI destination, boolean overwrite,
            boolean stopOnErrors, boolean async) throws LBException {
        // TODO: not sure how we should handle stopOnError and async
        //       - currently, async gets set to true by the super
        //       - not sure how stopOneErrors is used
        super.getOptions().getBooleanOption(LexGridConstants.OPTION_FORCE).setOptionValue(overwrite);
        super.export(source, destination);
    }       
}