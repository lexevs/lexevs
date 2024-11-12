/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.NCIHistory;

/**
 * A change event as documented in
 * ftp://ftp1.nci.nih.gov/pub/cacore/EVS/ReadMe_history.txt. Note
 * that date and time of the change event is recorded in the
 * containing version.
 *  All change events for the same/date and time a recorded in the
 * same verison.
 *  
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class NCIChangeEvent implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The activity being recorded (create, modify, split, merge,
     * retire)
     */
    private org.LexGrid.LexBIG.DataModel.NCIHistory.types.ChangeType _editaction;

    /**
     * The unique, permanent, alphanumeric identifier of the concept
     */
    private java.lang.String _conceptcode;

    /**
     * The current text name of the concept. Typed as conceptCode
     * because it serves that function.
     */
    private java.lang.String _conceptName;

    /**
     * The editDate of the change event.
     */
    private java.util.Date _editDate;

    /**
     * The identifier for a concept affected by or influencing the
     * action, as detailed below
     */
    private java.lang.String _referencecode;

    /**
     * The current text name of the reference concept in all cases
     * except concept name changes. For 
     *  these, the referencename is the old name of the current
     * concept.
     *  Reference codes are recorded in the following
     * circumstances:
     *  
     *  Merges - 
     *  In a merge, two concepts are merged into one. One of the
     * two concepts survives and the other concept is retired. 
     *  A merge history record is written for both of the concepts
     * with a reference code of the surviving concept and a 
     *  retire record is written for the concept that retires. In
     * the case of A merging with B and A surviving, the history 
     *  will appear as follows:
     *  C11111|A|merge|dd-mon-yy|C11111|A
     *  C22222|B|merge|dd-mon-yy|C11111|A
     *  C22222|B|retire|dd-mon-yy|(null)|(null)
     *  
     *  Splits - 
     *  In a split, a single concept is split into two. The
     * original concept survives and a new concept is generated.
     * Two 
     *  split records are written for the original concept with
     * reference codes for the resulting concepts and a create
     * history
     *  record is written for the new concept. In the case of A
     * being split into A and B the history will appear as follows:
     *  C22222|B|create|dd-mon-yy|(null)|(null)
     *  C11111|A|split|dd-mon-yy|C22222|B
     *  C11111|A|split|dd-mon-yy|C11111|A
     *  
     *  Retires -
     *  In a retirement the concept is moved from it's old location
     * in the tree hierarchy into the Retired_Kind. A retire 
     *  record is written for the retiring concept with a reference
     * code of the old superconcept. If a concept has multiple 
     *  superconcepts, then a retire record is written for each
     * reference. In the case of retiring concept A which has two 
     *  superconcepts (B and C), the history will appear as
     * follows:
     *  C11111|A|retire|dd-mon-yy|C22222|B
     *  C11111|A|retire|dd-mon-yy|C33333|C
     *  
     *  Concept Name Changes - 
     *  When a history record is written, the current name of the
     * concept is recorded in the history. We can match the 
     *  conceptcode from the current Thesaurus against the
     * conceptcodes in the history to determine if any conceptnames
     * have 
     *  changed. In the case of concept A having it's name changed
     * to B, the history will appear as follows:
     *  C11111|B|modify|dd-mon-yy|(null)|A
     *  
     */
    private java.lang.String _referencename;


      //----------------/
     //- Constructors -/
    //----------------/

    public NCIChangeEvent() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'conceptName'. The field
     * 'conceptName' has the following description: The current
     * text name of the concept. Typed as conceptCode because it
     * serves that function.
     * 
     * @return the value of field 'ConceptName'.
     */
    public java.lang.String getConceptName(
    ) {
        return this._conceptName;
    }

    /**
     * Returns the value of field 'conceptcode'. The field
     * 'conceptcode' has the following description: The unique,
     * permanent, alphanumeric identifier of the concept
     * 
     * @return the value of field 'Conceptcode'.
     */
    public java.lang.String getConceptcode(
    ) {
        return this._conceptcode;
    }

    /**
     * Returns the value of field 'editDate'. The field 'editDate'
     * has the following description: The editDate of the change
     * event.
     * 
     * @return the value of field 'EditDate'.
     */
    public java.util.Date getEditDate(
    ) {
        return this._editDate;
    }

    /**
     * Returns the value of field 'editaction'. The field
     * 'editaction' has the following description: The activity
     * being recorded (create, modify, split, merge, retire)
     * 
     * @return the value of field 'Editaction'.
     */
    public org.LexGrid.LexBIG.DataModel.NCIHistory.types.ChangeType getEditaction(
    ) {
        return this._editaction;
    }

    /**
     * Returns the value of field 'referencecode'. The field
     * 'referencecode' has the following description: The
     * identifier for a concept affected by or influencing the
     * action, as detailed below
     * 
     * @return the value of field 'Referencecode'.
     */
    public java.lang.String getReferencecode(
    ) {
        return this._referencecode;
    }

    /**
     * Returns the value of field 'referencename'. The field
     * 'referencename' has the following description: The current
     * text name of the reference concept in all cases except
     * concept name changes. For 
     *  these, the referencename is the old name of the current
     * concept.
     *  Reference codes are recorded in the following
     * circumstances:
     *  
     *  Merges - 
     *  In a merge, two concepts are merged into one. One of the
     * two concepts survives and the other concept is retired. 
     *  A merge history record is written for both of the concepts
     * with a reference code of the surviving concept and a 
     *  retire record is written for the concept that retires. In
     * the case of A merging with B and A surviving, the history 
     *  will appear as follows:
     *  C11111|A|merge|dd-mon-yy|C11111|A
     *  C22222|B|merge|dd-mon-yy|C11111|A
     *  C22222|B|retire|dd-mon-yy|(null)|(null)
     *  
     *  Splits - 
     *  In a split, a single concept is split into two. The
     * original concept survives and a new concept is generated.
     * Two 
     *  split records are written for the original concept with
     * reference codes for the resulting concepts and a create
     * history
     *  record is written for the new concept. In the case of A
     * being split into A and B the history will appear as follows:
     *  C22222|B|create|dd-mon-yy|(null)|(null)
     *  C11111|A|split|dd-mon-yy|C22222|B
     *  C11111|A|split|dd-mon-yy|C11111|A
     *  
     *  Retires -
     *  In a retirement the concept is moved from it's old location
     * in the tree hierarchy into the Retired_Kind. A retire 
     *  record is written for the retiring concept with a reference
     * code of the old superconcept. If a concept has multiple 
     *  superconcepts, then a retire record is written for each
     * reference. In the case of retiring concept A which has two 
     *  superconcepts (B and C), the history will appear as
     * follows:
     *  C11111|A|retire|dd-mon-yy|C22222|B
     *  C11111|A|retire|dd-mon-yy|C33333|C
     *  
     *  Concept Name Changes - 
     *  When a history record is written, the current name of the
     * concept is recorded in the history. We can match the 
     *  conceptcode from the current Thesaurus against the
     * conceptcodes in the history to determine if any conceptnames
     * have 
     *  changed. In the case of concept A having it's name changed
     * to B, the history will appear as follows:
     *  C11111|B|modify|dd-mon-yy|(null)|A
     *  
     * 
     * @return the value of field 'Referencename'.
     */
    public java.lang.String getReferencename(
    ) {
        return this._referencename;
    }

    /**
     * Sets the value of field 'conceptName'. The field
     * 'conceptName' has the following description: The current
     * text name of the concept. Typed as conceptCode because it
     * serves that function.
     * 
     * @param conceptName the value of field 'conceptName'.
     */
    public void setConceptName(
            final java.lang.String conceptName) {
        this._conceptName = conceptName;
    }

    /**
     * Sets the value of field 'conceptcode'. The field
     * 'conceptcode' has the following description: The unique,
     * permanent, alphanumeric identifier of the concept
     * 
     * @param conceptcode the value of field 'conceptcode'.
     */
    public void setConceptcode(
            final java.lang.String conceptcode) {
        this._conceptcode = conceptcode;
    }

    /**
     * Sets the value of field 'editDate'. The field 'editDate' has
     * the following description: The editDate of the change event.
     * 
     * @param editDate the value of field 'editDate'.
     */
    public void setEditDate(
            final java.util.Date editDate) {
        this._editDate = editDate;
    }

    /**
     * Sets the value of field 'editaction'. The field 'editaction'
     * has the following description: The activity being recorded
     * (create, modify, split, merge, retire)
     * 
     * @param editaction the value of field 'editaction'.
     */
    public void setEditaction(
            final org.LexGrid.LexBIG.DataModel.NCIHistory.types.ChangeType editaction) {
        this._editaction = editaction;
    }

    /**
     * Sets the value of field 'referencecode'. The field
     * 'referencecode' has the following description: The
     * identifier for a concept affected by or influencing the
     * action, as detailed below
     * 
     * @param referencecode the value of field 'referencecode'.
     */
    public void setReferencecode(
            final java.lang.String referencecode) {
        this._referencecode = referencecode;
    }

    /**
     * Sets the value of field 'referencename'. The field
     * 'referencename' has the following description: The current
     * text name of the reference concept in all cases except
     * concept name changes. For 
     *  these, the referencename is the old name of the current
     * concept.
     *  Reference codes are recorded in the following
     * circumstances:
     *  
     *  Merges - 
     *  In a merge, two concepts are merged into one. One of the
     * two concepts survives and the other concept is retired. 
     *  A merge history record is written for both of the concepts
     * with a reference code of the surviving concept and a 
     *  retire record is written for the concept that retires. In
     * the case of A merging with B and A surviving, the history 
     *  will appear as follows:
     *  C11111|A|merge|dd-mon-yy|C11111|A
     *  C22222|B|merge|dd-mon-yy|C11111|A
     *  C22222|B|retire|dd-mon-yy|(null)|(null)
     *  
     *  Splits - 
     *  In a split, a single concept is split into two. The
     * original concept survives and a new concept is generated.
     * Two 
     *  split records are written for the original concept with
     * reference codes for the resulting concepts and a create
     * history
     *  record is written for the new concept. In the case of A
     * being split into A and B the history will appear as follows:
     *  C22222|B|create|dd-mon-yy|(null)|(null)
     *  C11111|A|split|dd-mon-yy|C22222|B
     *  C11111|A|split|dd-mon-yy|C11111|A
     *  
     *  Retires -
     *  In a retirement the concept is moved from it's old location
     * in the tree hierarchy into the Retired_Kind. A retire 
     *  record is written for the retiring concept with a reference
     * code of the old superconcept. If a concept has multiple 
     *  superconcepts, then a retire record is written for each
     * reference. In the case of retiring concept A which has two 
     *  superconcepts (B and C), the history will appear as
     * follows:
     *  C11111|A|retire|dd-mon-yy|C22222|B
     *  C11111|A|retire|dd-mon-yy|C33333|C
     *  
     *  Concept Name Changes - 
     *  When a history record is written, the current name of the
     * concept is recorded in the history. We can match the 
     *  conceptcode from the current Thesaurus against the
     * conceptcodes in the history to determine if any conceptnames
     * have 
     *  changed. In the case of concept A having it's name changed
     * to B, the history will appear as follows:
     *  C11111|B|modify|dd-mon-yy|(null)|A
     *  
     * 
     * @param referencename the value of field 'referencename'.
     */
    public void setReferencename(
            final java.lang.String referencename) {
        this._referencename = referencename;
    }

}
