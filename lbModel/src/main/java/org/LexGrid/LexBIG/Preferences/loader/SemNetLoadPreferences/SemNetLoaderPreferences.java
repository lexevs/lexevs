/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences;

/**
 * Class SemNetLoaderPreferences.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SemNetLoaderPreferences extends org.LexGrid.LexBIG.Preferences.loader.LoadPreferences.LoaderPreferences 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The load parameter controls which inherited relationships
     * are loaded and navigable within
     *  LexBIG. When selecting the option not to load inherited
     * relationships, all associations
     *  are extracted from the source file SRSTR (stated
     * relations). When loading all inherited
     *  relations, associations are extracted from the source file
     * SRSTRE1 (classified relations).
     *  At NCI's request we provided an additional option to load
     * only stated relations for direct
     *  subclass ('is_a') associations, but inherited relationships
     * for all other associations.
     *  This was intended to provide similar behavior to their
     * provision of OWL sources.
     *  Note that direct or stated relationships are always
     * imported, regardless of the selected
     *  option.
     *  
     */
    private org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences.types.InheritanceLevelType _inheritanceLevel;


      //----------------/
     //- Constructors -/
    //----------------/

    public SemNetLoaderPreferences() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'inheritanceLevel'. The field
     * 'inheritanceLevel' has the following description: The load
     * parameter controls which inherited relationships are loaded
     * and navigable within
     *  LexBIG. When selecting the option not to load inherited
     * relationships, all associations
     *  are extracted from the source file SRSTR (stated
     * relations). When loading all inherited
     *  relations, associations are extracted from the source file
     * SRSTRE1 (classified relations).
     *  At NCI's request we provided an additional option to load
     * only stated relations for direct
     *  subclass ('is_a') associations, but inherited relationships
     * for all other associations.
     *  This was intended to provide similar behavior to their
     * provision of OWL sources.
     *  Note that direct or stated relationships are always
     * imported, regardless of the selected
     *  option.
     *  
     * 
     * @return the value of field 'InheritanceLevel'.
     */
    public org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences.types.InheritanceLevelType getInheritanceLevel(
    ) {
        return this._inheritanceLevel;
    }

    /**
     * Sets the value of field 'inheritanceLevel'. The field
     * 'inheritanceLevel' has the following description: The load
     * parameter controls which inherited relationships are loaded
     * and navigable within
     *  LexBIG. When selecting the option not to load inherited
     * relationships, all associations
     *  are extracted from the source file SRSTR (stated
     * relations). When loading all inherited
     *  relations, associations are extracted from the source file
     * SRSTRE1 (classified relations).
     *  At NCI's request we provided an additional option to load
     * only stated relations for direct
     *  subclass ('is_a') associations, but inherited relationships
     * for all other associations.
     *  This was intended to provide similar behavior to their
     * provision of OWL sources.
     *  Note that direct or stated relationships are always
     * imported, regardless of the selected
     *  option.
     *  
     * 
     * @param inheritanceLevel the value of field 'inheritanceLevel'
     */
    public void setInheritanceLevel(
            final org.LexGrid.LexBIG.Preferences.loader.SemNetLoadPreferences.types.InheritanceLevelType inheritanceLevel) {
        this._inheritanceLevel = inheritanceLevel;
    }

}
