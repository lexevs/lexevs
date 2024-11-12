/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.enums;

/**
 * Implementation of a path to root resolve option
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class HierarchyPathResolveOption implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * resolve option for a hiearchy path to root. Use limited to
     * the following options: ALL, ONE, ONE_PER_HIERARCHY,
     * ONE_PER_ROOT 
     */
    private java.lang.String _pathToRootResovleOption;


      //----------------/
     //- Constructors -/
    //----------------/

    public HierarchyPathResolveOption() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'pathToRootResovleOption'. The
     * field 'pathToRootResovleOption' has the following
     * description: resolve option for a hiearchy path to root. Use
     * limited to the following options: ALL, ONE,
     * ONE_PER_HIERARCHY, ONE_PER_ROOT 
     * 
     * @return the value of field 'PathToRootResovleOption'.
     */
    public java.lang.String getPathToRootResovleOption(
    ) {
        return this._pathToRootResovleOption;
    }

    /**
     * Sets the value of field 'pathToRootResovleOption'. The field
     * 'pathToRootResovleOption' has the following description:
     * resolve option for a hiearchy path to root. Use limited to
     * the following options: ALL, ONE, ONE_PER_HIERARCHY,
     * ONE_PER_ROOT 
     * 
     * @param pathToRootResovleOption the value of field
     * 'pathToRootResovleOption'.
     */
    public void setPathToRootResovleOption(
            final java.lang.String pathToRootResovleOption) {
        this._pathToRootResovleOption = pathToRootResovleOption;
    }

}
