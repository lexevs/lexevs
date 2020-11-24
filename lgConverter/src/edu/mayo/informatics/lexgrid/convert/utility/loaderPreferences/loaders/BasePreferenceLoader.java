
package edu.mayo.informatics.lexgrid.convert.utility.loaderPreferences.loaders;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.LexGrid.LexBIG.Preferences.loader.LoadPreferences.LoaderPreferences;
import org.apache.log4j.Logger;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import edu.mayo.informatics.lexgrid.convert.exceptions.LgConvertException;

/**
 * Base class to load loader preferences from an XML file
 * 
 * @author <A HREF="mailto:peterson.kevin@mayo.edu">Kevin Peterson</A>
 */
public class BasePreferenceLoader {

    protected static Logger log = Logger.getLogger("convert.PreferenceLoader");

    protected URI prefs;

    public LoaderPreferences unmarshal(Class<?> preferencesType) throws LgConvertException {
        try {
            return (LoaderPreferences) Unmarshaller.unmarshal(preferencesType, new FileReader(prefs.getPath()));
        } catch (MarshalException e) {
            log.error("Error creating Preferences from XML.", e);
            throw new LgConvertException(e);
        } catch (ValidationException e) {
            log.error("Preference XML file is not valid.", e);
            throw new LgConvertException(e);
        } catch (IOException e) {
            log.error("Preference XML file not found.", e);
            throw new LgConvertException(e);
        }
    }

    /**
     * Validates an XML Preferences file against a given XSD schema
     * 
     * @param prefs
     *            The location of the XML preferences file.
     * @param schema
     *            The location of the XSD to validate against.
     * @return Whether or not the XML validates against the given XSD. Any
     *         errors will be logged.
     */
    protected boolean validate(URI prefs, URL schema) {
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            // get the custom xsd schema describing the required format for my
            // XML files.
            Schema schemaXSD = schemaFactory.newSchema(schema);

            // Create a Validator capable of validating XML files according to
            // my custom schema.
            Validator validator = schemaXSD.newValidator();

            // Get a parser capable of parsing vanilla XML into a DOM tree
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);

            DocumentBuilder parser = factory.newDocumentBuilder();

            // parse the XML purely as XML and get a DOM tree represenation.
            Document document = parser.parse(prefs.toString());

            // parse the XML DOM tree againts the stricter XSD schema
            validator.validate(new DOMSource(document));
            return true;
        } catch (SAXException e) {
            log.error(e);
            return false;
        } catch (ParserConfigurationException e) {
            log.error(e);
            return false;
        } catch (IOException e) {
            log.error(e);
            return false;
        }
    }

    public URI getPreferencesURI() {
        return prefs;
    }

    public void setPreferencesURI(URI uri) {
        prefs = uri;
    }
}