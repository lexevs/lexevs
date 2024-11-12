/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.LexGrid.LexBIG.DataModel.Collections; 
import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class CodedNodeReferenceList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class CodedNodeReferenceList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codedNodeReferenceList.
     */
    private java.util.List<org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference> _codedNodeReferenceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodedNodeReferenceList() {
        super();
        this._codedNodeReferenceList = new java.util.ArrayList<org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCodedNodeReference
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCodedNodeReference(
            final org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference vCodedNodeReference)
    throws java.lang.IndexOutOfBoundsException {
        this._codedNodeReferenceList.add(vCodedNodeReference);
    }

    /**
     * 
     * 
     * @param index
     * @param vCodedNodeReference
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCodedNodeReference(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference vCodedNodeReference)
    throws java.lang.IndexOutOfBoundsException {
        this._codedNodeReferenceList.add(index, vCodedNodeReference);
    }

    /**
     * Method enumerateCodedNodeReference.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference> enumerateCodedNodeReference(
    ) {
        return java.util.Collections.enumeration(this._codedNodeReferenceList);
    }

    /**
     * Method getCodedNodeReference.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference at the
     * given index
     */
    public org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference getCodedNodeReference(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._codedNodeReferenceList.size()) {
            throw new IndexOutOfBoundsException("getCodedNodeReference: Index value '" + index + "' not in range [0.." + (this._codedNodeReferenceList.size() - 1) + "]");
        }

        return (org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference) _codedNodeReferenceList.get(index);
    }

    /**
     * Method getCodedNodeReference.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference[] getCodedNodeReference(
    ) {
        org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference[] array = new org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference[0];
        return (org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference[]) this._codedNodeReferenceList.toArray(array);
    }

    /**
     * Method getCodedNodeReferenceCount.
     * 
     * @return the size of this collection
     */
    public int getCodedNodeReferenceCount(
    ) {
        return this._codedNodeReferenceList.size();
    }

    /**
     * Method iterateCodedNodeReference.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference> iterateCodedNodeReference(
    ) {
        return this._codedNodeReferenceList.iterator();
    }

    /**
     */
    public void removeAllCodedNodeReference(
    ) {
        this._codedNodeReferenceList.clear();
    }

    /**
     * Method removeCodedNodeReference.
     * 
     * @param vCodedNodeReference
     * @return true if the object was removed from the collection.
     */
    public boolean removeCodedNodeReference(
            final org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference vCodedNodeReference) {
        boolean removed = _codedNodeReferenceList.remove(vCodedNodeReference);
        return removed;
    }

    /**
     * Method removeCodedNodeReferenceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference removeCodedNodeReferenceAt(
            final int index) {
        java.lang.Object obj = this._codedNodeReferenceList.remove(index);
        return (org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCodedNodeReference
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCodedNodeReference(
            final int index,
            final org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference vCodedNodeReference)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._codedNodeReferenceList.size()) {
            throw new IndexOutOfBoundsException("setCodedNodeReference: Index value '" + index + "' not in range [0.." + (this._codedNodeReferenceList.size() - 1) + "]");
        }

        this._codedNodeReferenceList.set(index, vCodedNodeReference);
    }

    /**
     * 
     * 
     * @param vCodedNodeReferenceArray
     */
    public void setCodedNodeReference(
            final org.LexGrid.LexBIG.DataModel.Core.CodedNodeReference[] vCodedNodeReferenceArray) {
        //-- copy array
        _codedNodeReferenceList.clear();

        for (int i = 0; i < vCodedNodeReferenceArray.length; i++) {
                this._codedNodeReferenceList.add(vCodedNodeReferenceArray[i]);
        }
    }

}
