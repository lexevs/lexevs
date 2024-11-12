/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements;

/**
 * Reports the state of LexBIG export operations.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ExportStatus extends org.LexGrid.LexBIG.DataModel.InterfaceElements.ProcessStatus 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Indicates the destination of the information being exported;
     * missing if no export is in progress.
     */
    private java.lang.String _destination;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExportStatus() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'destination'. The field
     * 'destination' has the following description: Indicates the
     * destination of the information being exported; missing if no
     * export is in progress.
     * 
     * @return the value of field 'Destination'.
     */
    public java.lang.String getDestination(
    ) {
        return this._destination;
    }

    /**
     * Sets the value of field 'destination'. The field
     * 'destination' has the following description: Indicates the
     * destination of the information being exported; missing if no
     * export is in progress.
     * 
     * @param destination the value of field 'destination'.
     */
    public void setDestination(
            final java.lang.String destination) {
        this._destination = destination;
    }

}
