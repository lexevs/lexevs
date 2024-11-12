/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.InterfaceElements;

/**
 * Reports the state of LexBIG runtime operations.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ProcessStatus implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Time that the operation started; missing if not yet started.
     */
    private java.util.Date _startTime;

    /**
     * The time that the load completed; missing if the operation
     * is still underway.
     */
    private java.util.Date _endTime;

    /**
     * State of the operation.
     */
    private org.LexGrid.LexBIG.DataModel.InterfaceElements.types.ProcessState _state = org.LexGrid.LexBIG.DataModel.InterfaceElements.types.ProcessState.fromValue("unknown");

    /**
     * Optional status message to convey additional information
     * about the current state of the operation.
     */
    private java.lang.String _message;

    /**
     * If true, error messages have been written to the associated
     * log; default is false.
     */
    private java.lang.Boolean _errorsLogged = new java.lang.Boolean("false");

    /**
     * If true, warning messages have been written to the
     * associated log; default is false.
     */
    private java.lang.Boolean _warningsLogged = new java.lang.Boolean("false");


      //----------------/
     //- Constructors -/
    //----------------/

    public ProcessStatus() {
        super();
        setState(org.LexGrid.LexBIG.DataModel.InterfaceElements.types.ProcessState.fromValue("unknown"));
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'endTime'. The field 'endTime'
     * has the following description: The time that the load
     * completed; missing if the operation is still underway.
     * 
     * @return the value of field 'EndTime'.
     */
    public java.util.Date getEndTime(
    ) {
        return this._endTime;
    }

    /**
     * Returns the value of field 'errorsLogged'. The field
     * 'errorsLogged' has the following description: If true, error
     * messages have been written to the associated log; default is
     * false.
     * 
     * @return the value of field 'ErrorsLogged'.
     */
    public java.lang.Boolean getErrorsLogged(
    ) {
        return this._errorsLogged;
    }

    /**
     * Returns the value of field 'message'. The field 'message'
     * has the following description: Optional status message to
     * convey additional information about the current state of the
     * operation.
     * 
     * @return the value of field 'Message'.
     */
    public java.lang.String getMessage(
    ) {
        return this._message;
    }

    /**
     * Returns the value of field 'startTime'. The field
     * 'startTime' has the following description: Time that the
     * operation started; missing if not yet started.
     * 
     * @return the value of field 'StartTime'.
     */
    public java.util.Date getStartTime(
    ) {
        return this._startTime;
    }

    /**
     * Returns the value of field 'state'. The field 'state' has
     * the following description: State of the operation.
     * 
     * @return the value of field 'State'.
     */
    public org.LexGrid.LexBIG.DataModel.InterfaceElements.types.ProcessState getState(
    ) {
        return this._state;
    }

    /**
     * Returns the value of field 'warningsLogged'. The field
     * 'warningsLogged' has the following description: If true,
     * warning messages have been written to the associated log;
     * default is false.
     * 
     * @return the value of field 'WarningsLogged'.
     */
    public java.lang.Boolean getWarningsLogged(
    ) {
        return this._warningsLogged;
    }

    /**
     * Returns the value of field 'errorsLogged'. The field
     * 'errorsLogged' has the following description: If true, error
     * messages have been written to the associated log; default is
     * false.
     * 
     * @return the value of field 'ErrorsLogged'.
     */
    public java.lang.Boolean isErrorsLogged(
    ) {
        return this._errorsLogged;
    }

    /**
     * Returns the value of field 'warningsLogged'. The field
     * 'warningsLogged' has the following description: If true,
     * warning messages have been written to the associated log;
     * default is false.
     * 
     * @return the value of field 'WarningsLogged'.
     */
    public java.lang.Boolean isWarningsLogged(
    ) {
        return this._warningsLogged;
    }

    /**
     * Sets the value of field 'endTime'. The field 'endTime' has
     * the following description: The time that the load completed;
     * missing if the operation is still underway.
     * 
     * @param endTime the value of field 'endTime'.
     */
    public void setEndTime(
            final java.util.Date endTime) {
        this._endTime = endTime;
    }

    /**
     * Sets the value of field 'errorsLogged'. The field
     * 'errorsLogged' has the following description: If true, error
     * messages have been written to the associated log; default is
     * false.
     * 
     * @param errorsLogged the value of field 'errorsLogged'.
     */
    public void setErrorsLogged(
            final java.lang.Boolean errorsLogged) {
        this._errorsLogged = errorsLogged;
    }

    /**
     * Sets the value of field 'message'. The field 'message' has
     * the following description: Optional status message to convey
     * additional information about the current state of the
     * operation.
     * 
     * @param message the value of field 'message'.
     */
    public void setMessage(
            final java.lang.String message) {
        this._message = message;
    }

    /**
     * Sets the value of field 'startTime'. The field 'startTime'
     * has the following description: Time that the operation
     * started; missing if not yet started.
     * 
     * @param startTime the value of field 'startTime'.
     */
    public void setStartTime(
            final java.util.Date startTime) {
        this._startTime = startTime;
    }

    /**
     * Sets the value of field 'state'. The field 'state' has the
     * following description: State of the operation.
     * 
     * @param state the value of field 'state'.
     */
    public void setState(
            final org.LexGrid.LexBIG.DataModel.InterfaceElements.types.ProcessState state) {
        this._state = state;
    }

    /**
     * Sets the value of field 'warningsLogged'. The field
     * 'warningsLogged' has the following description: If true,
     * warning messages have been written to the associated log;
     * default is false.
     * 
     * @param warningsLogged the value of field 'warningsLogged'.
     */
    public void setWarningsLogged(
            final java.lang.Boolean warningsLogged) {
        this._warningsLogged = warningsLogged;
    }

}
