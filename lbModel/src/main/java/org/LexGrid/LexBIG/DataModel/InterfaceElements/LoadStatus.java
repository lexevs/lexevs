/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements;

/**
 * Reports the state of LexBIG load operations.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class LoadStatus extends org.LexGrid.LexBIG.DataModel.InterfaceElements.ProcessStatus 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Number of concepts that have been processed.
     */
    private java.lang.Integer _numConceptsLoaded;

    /**
     * Number of relations that have been processed.
     */
    private java.lang.Integer _numRelationsLoaded;

    /**
     * Indicates the source of the information being loaded;
     * missing if no load is in progress.
     */
    private java.lang.String _loadSource;


      //----------------/
     //- Constructors -/
    //----------------/

    public LoadStatus() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'loadSource'. The field
     * 'loadSource' has the following description: Indicates the
     * source of the information being loaded; missing if no load
     * is in progress.
     * 
     * @return the value of field 'LoadSource'.
     */
    public java.lang.String getLoadSource(
    ) {
        return this._loadSource;
    }

    /**
     * Returns the value of field 'numConceptsLoaded'. The field
     * 'numConceptsLoaded' has the following description: Number of
     * concepts that have been processed.
     * 
     * @return the value of field 'NumConceptsLoaded'.
     */
    public java.lang.Integer getNumConceptsLoaded(
    ) {
        return this._numConceptsLoaded;
    }

    /**
     * Returns the value of field 'numRelationsLoaded'. The field
     * 'numRelationsLoaded' has the following description: Number
     * of relations that have been processed.
     * 
     * @return the value of field 'NumRelationsLoaded'.
     */
    public java.lang.Integer getNumRelationsLoaded(
    ) {
        return this._numRelationsLoaded;
    }

    /**
     * Sets the value of field 'loadSource'. The field 'loadSource'
     * has the following description: Indicates the source of the
     * information being loaded; missing if no load is in progress.
     * 
     * @param loadSource the value of field 'loadSource'.
     */
    public void setLoadSource(
            final java.lang.String loadSource) {
        this._loadSource = loadSource;
    }

    /**
     * Sets the value of field 'numConceptsLoaded'. The field
     * 'numConceptsLoaded' has the following description: Number of
     * concepts that have been processed.
     * 
     * @param numConceptsLoaded the value of field
     * 'numConceptsLoaded'.
     */
    public void setNumConceptsLoaded(
            final java.lang.Integer numConceptsLoaded) {
        this._numConceptsLoaded = numConceptsLoaded;
    }

    /**
     * Sets the value of field 'numRelationsLoaded'. The field
     * 'numRelationsLoaded' has the following description: Number
     * of relations that have been processed.
     * 
     * @param numRelationsLoaded the value of field
     * 'numRelationsLoaded'.
     */
    public void setNumRelationsLoaded(
            final java.lang.Integer numRelationsLoaded) {
        this._numRelationsLoaded = numRelationsLoaded;
    }

}
