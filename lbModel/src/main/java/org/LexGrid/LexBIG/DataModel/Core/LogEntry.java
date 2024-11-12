/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Core; 
	import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class LogEntry.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
	public class LogEntry implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The URL associated with the log entry. Used for retrieving
     *  particular types of logs.
     */
    private java.lang.String _associatedURL;

    /**
     * The time that the entry was made. Time is local to
     * originator
     *  location.
     */
    private java.util.Date _entryTime;

    /**
     * Level (error, warn, info, ...)
     */
    private org.LexGrid.LexBIG.DataModel.Core.types.LogLevel _entryLevel;

    /**
     * Number that uniquely identifies the message within the error
     *  system.
     */
    private java.lang.Integer _messageNumber;

    /**
     * Unique identifier of the process that generated the log
     *  entry.
     */
    private java.lang.String _processUID;

    /**
     * Name of program that generated the log
     *  entry
     */
    private java.lang.String _programName;

    /**
     * Text of message
     */
    private java.lang.String _message;


      //----------------/
     //- Constructors -/
    //----------------/

    public LogEntry() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'associatedURL'. The field
     * 'associatedURL' has the following description: The URL
     * associated with the log entry. Used for retrieving
     *  particular types of logs.
     * 
     * @return the value of field 'AssociatedURL'.
     */
    public java.lang.String getAssociatedURL(
    ) {
        return this._associatedURL;
    }

    /**
     * Returns the value of field 'entryLevel'. The field
     * 'entryLevel' has the following description: Level (error,
     * warn, info, ...)
     * 
     * @return the value of field 'EntryLevel'.
     */
    public org.LexGrid.LexBIG.DataModel.Core.types.LogLevel getEntryLevel(
    ) {
        return this._entryLevel;
    }

    /**
     * Returns the value of field 'entryTime'. The field
     * 'entryTime' has the following description: The time that the
     * entry was made. Time is local to originator
     *  location.
     * 
     * @return the value of field 'EntryTime'.
     */
    public java.util.Date getEntryTime(
    ) {
        return this._entryTime;
    }

    /**
     * Returns the value of field 'message'. The field 'message'
     * has the following description: Text of message
     * 
     * @return the value of field 'Message'.
     */
    public java.lang.String getMessage(
    ) {
        return this._message;
    }

    /**
     * Returns the value of field 'messageNumber'. The field
     * 'messageNumber' has the following description: Number that
     * uniquely identifies the message within the error
     *  system.
     * 
     * @return the value of field 'MessageNumber'.
     */
    public java.lang.Integer getMessageNumber(
    ) {
        return this._messageNumber;
    }

    /**
     * Returns the value of field 'processUID'. The field
     * 'processUID' has the following description: Unique
     * identifier of the process that generated the log
     *  entry.
     * 
     * @return the value of field 'ProcessUID'.
     */
    public java.lang.String getProcessUID(
    ) {
        return this._processUID;
    }

    /**
     * Returns the value of field 'programName'. The field
     * 'programName' has the following description: Name of program
     * that generated the log
     *  entry
     * 
     * @return the value of field 'ProgramName'.
     */
    public java.lang.String getProgramName(
    ) {
        return this._programName;
    }

    /**
     * Sets the value of field 'associatedURL'. The field
     * 'associatedURL' has the following description: The URL
     * associated with the log entry. Used for retrieving
     *  particular types of logs.
     * 
     * @param associatedURL the value of field 'associatedURL'.
     */
    public void setAssociatedURL(
            final java.lang.String associatedURL) {
        this._associatedURL = associatedURL;
    }

    /**
     * Sets the value of field 'entryLevel'. The field 'entryLevel'
     * has the following description: Level (error, warn, info,
     * ...)
     * 
     * @param entryLevel the value of field 'entryLevel'.
     */
    public void setEntryLevel(
            final org.LexGrid.LexBIG.DataModel.Core.types.LogLevel entryLevel) {
        this._entryLevel = entryLevel;
    }

    /**
     * Sets the value of field 'entryTime'. The field 'entryTime'
     * has the following description: The time that the entry was
     * made. Time is local to originator
     *  location.
     * 
     * @param entryTime the value of field 'entryTime'.
     */
    public void setEntryTime(
            final java.util.Date entryTime) {
        this._entryTime = entryTime;
    }

    /**
     * Sets the value of field 'message'. The field 'message' has
     * the following description: Text of message
     * 
     * @param message the value of field 'message'.
     */
    public void setMessage(
            final java.lang.String message) {
        this._message = message;
    }

    /**
     * Sets the value of field 'messageNumber'. The field
     * 'messageNumber' has the following description: Number that
     * uniquely identifies the message within the error
     *  system.
     * 
     * @param messageNumber the value of field 'messageNumber'.
     */
    public void setMessageNumber(
            final java.lang.Integer messageNumber) {
        this._messageNumber = messageNumber;
    }

    /**
     * Sets the value of field 'processUID'. The field 'processUID'
     * has the following description: Unique identifier of the
     * process that generated the log
     *  entry.
     * 
     * @param processUID the value of field 'processUID'.
     */
    public void setProcessUID(
            final java.lang.String processUID) {
        this._processUID = processUID;
    }

    /**
     * Sets the value of field 'programName'. The field
     * 'programName' has the following description: Name of program
     * that generated the log
     *  entry
     * 
     * @param programName the value of field 'programName'.
     */
    public void setProgramName(
            final java.lang.String programName) {
        this._programName = programName;
    }

}
