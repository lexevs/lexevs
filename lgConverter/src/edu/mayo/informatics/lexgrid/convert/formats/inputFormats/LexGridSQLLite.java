
package edu.mayo.informatics.lexgrid.convert.formats.inputFormats;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

import org.LexGrid.util.sql.sqlReconnect.WrappedConnection;
import org.apache.log4j.Logger;

import edu.mayo.informatics.lexgrid.convert.exceptions.ConnectionFailure;
import edu.mayo.informatics.lexgrid.convert.exceptions.UnexpectedError;
import edu.mayo.informatics.lexgrid.convert.formats.InputFormatInterface;
import edu.mayo.informatics.lexgrid.convert.formats.Option;
import edu.mayo.informatics.lexgrid.convert.formats.baseFormats.SQLBase;
import edu.mayo.informatics.lexgrid.convert.formats.outputFormats.DeleteLexGridTerminology;
import edu.mayo.informatics.lexgrid.convert.formats.outputFormats.LexGridLDAPOut;
import edu.mayo.informatics.lexgrid.convert.utility.StringComparator;

/**
 * Details for connecting to SQL Lite.
 * 
 * @author <A HREF="mailto:armbrust.daniel@mayo.edu">Dan Armbrust</A>
 * @version subversion $Revision: 7198 $ checked in on $Date: 2008-02-15
 *          18:08:36 +0000 (Fri, 15 Feb 2008) $
 */
public class LexGridSQLLite extends SQLBase implements InputFormatInterface {
    protected static Logger log = Logger.getLogger("convert.gui");

    public static final String description = "LexGrid SQLLite Database";

    public LexGridSQLLite(String username, String password, String server, String driver) {
        this.username = username;
        this.password = password;
        this.server = server;
        this.driver = driver;
    }

    public LexGridSQLLite() {

    }

    public String getConnectionSummary() {
        return getConnectionSummary(description);
    }

    public String getDescription() {
        return description;
    }

    public String[] getSupportedOutputFormats() {
        return new String[] { LexGridLDAPOut.description, DeleteLexGridTerminology.description };
    }

    public Option[] getOptions() {
        return new Option[] {};
    }

    public String[] getAvailableTerminologies() throws ConnectionFailure, UnexpectedError {
        try {
            String[] terminologies = new String[] {};

            ArrayList temp = new ArrayList();

            DriverManager.setLoginTimeout(5);
            Connection sqlConnection;
            try {
                sqlConnection = new WrappedConnection(getUsername(), getPassword(), getDriver(), getServer());

            } catch (ClassNotFoundException e1) {
                log.error("The class you specified for your sql driver could not be found on the path.");
                throw new ConnectionFailure(
                        "The class you specified for your sql driver could not be found on the path.");
            }
            PreparedStatement getTerminologies = sqlConnection
                    .prepareStatement("Select codingSchemeName from codingScheme");
            ResultSet results = getTerminologies.executeQuery();
            while (results.next()) {
                temp.add(results.getString("codingSchemeName"));
            }
            results.close();
            getTerminologies.close();
            sqlConnection.close();

            terminologies = (String[]) temp.toArray(new String[temp.size()]);
            Arrays.sort(terminologies, new StringComparator());

            return terminologies;
        } catch (ConnectionFailure e) {
            throw e;
        } catch (Exception e) {
            log.error("An error occurred while getting the terminologies.", e);
            throw new UnexpectedError("An error occurred while getting the terminologies.", e);
        }
    }
}