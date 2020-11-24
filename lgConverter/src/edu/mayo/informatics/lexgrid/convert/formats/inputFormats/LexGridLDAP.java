
package edu.mayo.informatics.lexgrid.convert.formats.inputFormats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import org.apache.log4j.Logger;

import edu.mayo.informatics.lexgrid.convert.exceptions.ConnectionFailure;
import edu.mayo.informatics.lexgrid.convert.exceptions.UnexpectedError;
import edu.mayo.informatics.lexgrid.convert.formats.InputFormatInterface;
import edu.mayo.informatics.lexgrid.convert.formats.Option;
import edu.mayo.informatics.lexgrid.convert.formats.baseFormats.LDAPBase;
import edu.mayo.informatics.lexgrid.convert.formats.outputFormats.DeleteLexGridTerminology;
import edu.mayo.informatics.lexgrid.convert.formats.outputFormats.IndexLexGridDatabase;
import edu.mayo.informatics.lexgrid.convert.formats.outputFormats.LexGridLDAPOut;
import edu.mayo.informatics.lexgrid.convert.formats.outputFormats.LexGridSQLLiteOut;
import edu.mayo.informatics.lexgrid.convert.formats.outputFormats.LexGridSQLOut;
import edu.mayo.informatics.lexgrid.convert.formats.outputFormats.LexGridXMLOut;
import edu.mayo.informatics.lexgrid.convert.formats.outputFormats.OBOOut;
import edu.mayo.informatics.lexgrid.convert.formats.outputFormats.RegisterLexGridTerminology;
import edu.mayo.informatics.lexgrid.convert.utility.Constants;
import edu.mayo.informatics.lexgrid.convert.utility.StringComparator;

/**
 * Details for connecting to LDAP.
 * 
 * @author <A HREF="mailto:armbrust.daniel@mayo.edu">Dan Armbrust</A>
 * @version subversion $Revision: 7198 $ checked in on $Date: 2008-02-15
 *          18:08:36 +0000 (Fri, 15 Feb 2008) $
 */
public class LexGridLDAP extends LDAPBase implements InputFormatInterface {
    private static Logger log = Logger.getLogger("convert.gui");

    public LexGridLDAP(String username, String password, String host, int port, String service) {
        if (host.toLowerCase().startsWith("ldap://")) {
            this.host = host.substring("ldap://".length());
        } else {
            this.host = host;
        }
        this.port = port;
        this.username = username;
        this.password = password;
        this.serviceDN = service;
    }

    public LexGridLDAP() {

    }

    public String[] getSupportedOutputFormats() {
        return new String[] { LexGridXMLOut.description, LexGridSQLOut.description, LexGridSQLLiteOut.description,
                LexGridLDAPOut.description, DeleteLexGridTerminology.description,
                RegisterLexGridTerminology.description, IndexLexGridDatabase.description, OBOOut.description };
    }

    public Option[] getOptions() {
        return new Option[] { new Option(Option.LDAP_PAGE_SIZE, new String(Constants.ldapPageSize + "")) };
    }

    public String[] getAvailableTerminologies() throws ConnectionFailure, UnexpectedError {
        try {
            String[] terminologies = new String[] {};

            String hostURL = "ldap://" + getHost() + ":" + getPort() + "/" + getServiceDN();

            ArrayList temp = new ArrayList();
            String searchBase = "dc=codingSchemes";
            String searchFilter = "(objectclass=codingSchemeClass)";
            SearchControls ctrl = new SearchControls();
            ctrl.setSearchScope(SearchControls.ONELEVEL_SCOPE);
            ctrl.setReturningAttributes(new String[] { "codingScheme" });

            Hashtable env = new Hashtable(10);
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
            env.put(Context.PROVIDER_URL, hostURL);
            env.put(Context.SECURITY_PRINCIPAL, getUsername());
            env.put(Context.SECURITY_CREDENTIALS, getPassword());
            env.put("com.sun.jndi.ldap.connect.timeout", "1000");

            DirContext ctx = new InitialDirContext(env);

            NamingEnumeration results = ctx.search(searchBase, searchFilter, ctrl);

            while (results.hasMore()) {
                SearchResult nextEntry = (SearchResult) results.next();
                temp.add((String) nextEntry.getAttributes().get("codingScheme").get());
            }
            terminologies = (String[]) temp.toArray(new String[temp.size()]);
            Arrays.sort(terminologies, new StringComparator());

            return terminologies;
        } catch (NamingException e) {
            log.error("Problem getting available terminologies", e);
            throw new ConnectionFailure("Problem getting the available terminologies", e);
        } catch (Exception e) {
            log.error("Problem getting available terminologies", e);
            throw new UnexpectedError("Problem getting the available terminologies", e);
        }
    }
}