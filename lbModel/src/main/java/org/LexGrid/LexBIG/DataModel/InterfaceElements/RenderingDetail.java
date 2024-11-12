/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements;

/**
 * The details of how a coding scheme is rendered in a given
 * service.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class RenderingDetail implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Timestamp when this coding scheme was last updated within
     * the context of the containing service
     */
    private java.util.Date _lastUpdateTime;

    /**
     * Status of the coding scheme version within the service
     * (pending, active, inactive). Note that a pending
     * deactivation is
     *  identified by the presence of a deactivate date.
     */
    private org.LexGrid.LexBIG.DataModel.Core.types.CodingSchemeVersionStatus _versionStatus;

    /**
     * If present, this is that date that this coding scheme is
     * scheduled to be deactivated (versionStatus = 'pending' or
     *  versionStatus='active') or was actually inactivated
     * (versionStatus='inactive')
     */
    private java.util.Date _deactivateDate;

    /**
     * The version metatags associated with this coding scheme in
     * this service.
     */
    private org.LexGrid.LexBIG.DataModel.Collections.CodingSchemeTagList _versionTags;


      //----------------/
     //- Constructors -/
    //----------------/

    public RenderingDetail() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'deactivateDate'. The field
     * 'deactivateDate' has the following description: If present,
     * this is that date that this coding scheme is scheduled to be
     * deactivated (versionStatus = 'pending' or
     *  versionStatus='active') or was actually inactivated
     * (versionStatus='inactive')
     * 
     * @return the value of field 'DeactivateDate'.
     */
    public java.util.Date getDeactivateDate(
    ) {
        return this._deactivateDate;
    }

    /**
     * Returns the value of field 'lastUpdateTime'. The field
     * 'lastUpdateTime' has the following description: Timestamp
     * when this coding scheme was last updated within the context
     * of the containing service
     * 
     * @return the value of field 'LastUpdateTime'.
     */
    public java.util.Date getLastUpdateTime(
    ) {
        return this._lastUpdateTime;
    }

    /**
     * Returns the value of field 'versionStatus'. The field
     * 'versionStatus' has the following description: Status of the
     * coding scheme version within the service (pending, active,
     * inactive). Note that a pending deactivation is
     *  identified by the presence of a deactivate date.
     * 
     * @return the value of field 'VersionStatus'.
     */
    public org.LexGrid.LexBIG.DataModel.Core.types.CodingSchemeVersionStatus getVersionStatus(
    ) {
        return this._versionStatus;
    }

    /**
     * Returns the value of field 'versionTags'. The field
     * 'versionTags' has the following description: The version
     * metatags associated with this coding scheme in this service.
     * 
     * @return the value of field 'VersionTags'.
     */
    public org.LexGrid.LexBIG.DataModel.Collections.CodingSchemeTagList getVersionTags(
    ) {
        return this._versionTags;
    }

    /**
     * Sets the value of field 'deactivateDate'. The field
     * 'deactivateDate' has the following description: If present,
     * this is that date that this coding scheme is scheduled to be
     * deactivated (versionStatus = 'pending' or
     *  versionStatus='active') or was actually inactivated
     * (versionStatus='inactive')
     * 
     * @param deactivateDate the value of field 'deactivateDate'.
     */
    public void setDeactivateDate(
            final java.util.Date deactivateDate) {
        this._deactivateDate = deactivateDate;
    }

    /**
     * Sets the value of field 'lastUpdateTime'. The field
     * 'lastUpdateTime' has the following description: Timestamp
     * when this coding scheme was last updated within the context
     * of the containing service
     * 
     * @param lastUpdateTime the value of field 'lastUpdateTime'.
     */
    public void setLastUpdateTime(
            final java.util.Date lastUpdateTime) {
        this._lastUpdateTime = lastUpdateTime;
    }

    /**
     * Sets the value of field 'versionStatus'. The field
     * 'versionStatus' has the following description: Status of the
     * coding scheme version within the service (pending, active,
     * inactive). Note that a pending deactivation is
     *  identified by the presence of a deactivate date.
     * 
     * @param versionStatus the value of field 'versionStatus'.
     */
    public void setVersionStatus(
            final org.LexGrid.LexBIG.DataModel.Core.types.CodingSchemeVersionStatus versionStatus) {
        this._versionStatus = versionStatus;
    }

    /**
     * Sets the value of field 'versionTags'. The field
     * 'versionTags' has the following description: The version
     * metatags associated with this coding scheme in this service.
     * 
     * @param versionTags the value of field 'versionTags'.
     */
    public void setVersionTags(
            final org.LexGrid.LexBIG.DataModel.Collections.CodingSchemeTagList versionTags) {
        this._versionTags = versionTags;
    }

}
