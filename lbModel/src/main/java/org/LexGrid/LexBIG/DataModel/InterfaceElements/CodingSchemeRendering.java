/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements;

/**
 * Information about a coding scheme as it appears in a particular
 * service.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodingSchemeRendering implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Summary of the coding scheme content as rendered by the
     * service.
     */
    private org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary _codingSchemeSummary;

    /**
     * Service specific information about the coding scheme renderin
     */
    private org.LexGrid.LexBIG.DataModel.InterfaceElements.RenderingDetail _renderingDetail;

    /**
     * The URL of a service the represents this coding scheme.
     */
    private org.LexGrid.LexBIG.DataModel.Core.ReferenceLink _serviceHandle;

    /**
     * The URL that represents the coding scheme itself within the
     * service.
     */
    private org.LexGrid.LexBIG.DataModel.Core.ReferenceLink _referenceLink;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodingSchemeRendering() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'codingSchemeSummary'. The field
     * 'codingSchemeSummary' has the following description: Summary
     * of the coding scheme content as rendered by the service.
     * 
     * @return the value of field 'CodingSchemeSummary'.
     */
    public org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary getCodingSchemeSummary(
    ) {
        return this._codingSchemeSummary;
    }

    /**
     * Returns the value of field 'referenceLink'. The field
     * 'referenceLink' has the following description: The URL that
     * represents the coding scheme itself within the service.
     * 
     * @return the value of field 'ReferenceLink'.
     */
    public org.LexGrid.LexBIG.DataModel.Core.ReferenceLink getReferenceLink(
    ) {
        return this._referenceLink;
    }

    /**
     * Returns the value of field 'renderingDetail'. The field
     * 'renderingDetail' has the following description: Service
     * specific information about the coding scheme rendering
     * 
     * @return the value of field 'RenderingDetail'.
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.RenderingDetail getRenderingDetail(
    ) {
        return this._renderingDetail;
    }

    /**
     * Returns the value of field 'serviceHandle'. The field
     * 'serviceHandle' has the following description: The URL of a
     * service the represents this coding scheme.
     * 
     * @return the value of field 'ServiceHandle'.
     */
    public org.LexGrid.LexBIG.DataModel.Core.ReferenceLink getServiceHandle(
    ) {
        return this._serviceHandle;
    }

    /**
     * Sets the value of field 'codingSchemeSummary'. The field
     * 'codingSchemeSummary' has the following description: Summary
     * of the coding scheme content as rendered by the service.
     * 
     * @param codingSchemeSummary the value of field
     * 'codingSchemeSummary'.
     */
    public void setCodingSchemeSummary(
            final org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary codingSchemeSummary) {
        this._codingSchemeSummary = codingSchemeSummary;
    }

    /**
     * Sets the value of field 'referenceLink'. The field
     * 'referenceLink' has the following description: The URL that
     * represents the coding scheme itself within the service.
     * 
     * @param referenceLink the value of field 'referenceLink'.
     */
    public void setReferenceLink(
            final org.LexGrid.LexBIG.DataModel.Core.ReferenceLink referenceLink) {
        this._referenceLink = referenceLink;
    }

    /**
     * Sets the value of field 'renderingDetail'. The field
     * 'renderingDetail' has the following description: Service
     * specific information about the coding scheme rendering
     * 
     * @param renderingDetail the value of field 'renderingDetail'.
     */
    public void setRenderingDetail(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.RenderingDetail renderingDetail) {
        this._renderingDetail = renderingDetail;
    }

    /**
     * Sets the value of field 'serviceHandle'. The field
     * 'serviceHandle' has the following description: The URL of a
     * service the represents this coding scheme.
     * 
     * @param serviceHandle the value of field 'serviceHandle'.
     */
    public void setServiceHandle(
            final org.LexGrid.LexBIG.DataModel.Core.ReferenceLink serviceHandle) {
        this._serviceHandle = serviceHandle;
    }

}
