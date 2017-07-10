package org.lexevs.dao.index.access.codingschemewithtype;

import org.LexGrid.annotations.LgClientSideSafe;

/**
 * Class CodingSchemeWithTypeList.
 */
@SuppressWarnings("serial")
@LgClientSideSafe 
public class CodingSchemeWithTypePropertyList implements java.io.Serializable {

  /**
   * Field _codingSchemeWithTypeList.
   */
  private java.util.List<org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType> _codingSchemeWithTypeList;

  public CodingSchemeWithTypePropertyList() {
      super();
      this._codingSchemeWithTypeList = new java.util.ArrayList<org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType>();
  }

  /**
   * @param vcodingSchemeWithType
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addCodingSchemeWithType(
          final org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType vCodingSchemeWithType)
  throws java.lang.IndexOutOfBoundsException {
      this._codingSchemeWithTypeList.add(vCodingSchemeWithType);
  }

  /**
   * @param index
   * @param  vCodingSchemeWithType
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addCodingSchemeWithType(
          final int index,
          final org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType vCodingSchemeWithType)
  throws java.lang.IndexOutOfBoundsException {
      this._codingSchemeWithTypeList.add(index, vCodingSchemeWithType);
  }

  /**
   * Method enumerateCodingSchemeWithTypeProperty.
   * 
   * @return an Enumeration over all possible elements of this
   * collection
   */
  public java.util.Enumeration<? extends org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType> enumerateCodingSchemeWithType(
  ) {
      return java.util.Collections.enumeration(this._codingSchemeWithTypeList);
  }

  /**
   * Method getCodingSchemeWithType.
   * 
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * org.lexevs.dao.index.access.codingscheme.CodingSchemeWithType at the
   * given index
   */
  public org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType getCodingSchemeWithType(
          final int index)
  throws java.lang.IndexOutOfBoundsException {
      // check bounds for index
      if (index < 0 || index >= this._codingSchemeWithTypeList.size()) {
          throw new IndexOutOfBoundsException("getCodingSchemeWithType: Index value '" + index + "' not in range [0.." + (this._codingSchemeWithTypeList.size() - 1) + "]");
      }

      return (org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType) _codingSchemeWithTypeList.get(index);
  }

  /**
   * Method getCodingSchemeWithType.Returns the contents of the
   * collection in an Array.  <p>Note:  Just in case the
   * collection contents are changing in another thread, we pass
   * a 0-length Array of the correct type into the API call. 
   * This way we <i>know</i> that the Array returned is of
   * exactly the correct length.
   * 
   * @return this collection as an Array
   */
  public org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType[] getCodingSchemeWithType(
  ) {
      org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType[] array = new org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType[0];
      return (org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType[]) this._codingSchemeWithTypeList.toArray(array);
  }

  /**
   * Method getCodingSchemeWithTypeCount.
   * 
   * @return the size of this collection
   */
  public int getCodingSchemeWithTypeCount(
  ) {
      return this._codingSchemeWithTypeList.size();
  }

  /**
   * Method iterateCodingSchemeWithType.
   * 
   * @return an Iterator over all possible elements in this
   * collection
   */
  public java.util.Iterator<? extends org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType> iterateCodingSchemeWithType(
  ) {
      return this._codingSchemeWithTypeList.iterator();
  }

  /**
   */
  public void removeAllCodingSchemeWithType(
  ) {
      this._codingSchemeWithTypeList.clear();
  }

  /**
   * Method removeCodingSchemeWithType.
   * 
   * @param vCodingSchemeWithType
   * @return true if the object was removed from the collection.
   */
  public boolean removeCodingSchemeWithTypey(
          final org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType vCodingSchemeWithType) {
      boolean removed = _codingSchemeWithTypeList.remove(vCodingSchemeWithType);
      return removed;
  }

  /**
   * Method removeCodingSchemeWithTypeAt.
   * 
   * @param index
   * @return the element removed from the collection
   */
  public org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType removeCodingSchemeWithTypeyAt(
          final int index) {
      java.lang.Object obj = this._codingSchemeWithTypeList.remove(index);
      return (org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType) obj;
  }

  /**
   * @param index
   * @param vCodingSchemeWithType
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setCodingSchemeWithTypey(
          final int index,
          final org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType vCodingSchemeWithType)
  throws java.lang.IndexOutOfBoundsException {
      // check bounds for index
      if (index < 0 || index >= this._codingSchemeWithTypeList.size()) {
          throw new IndexOutOfBoundsException("setMetadataProperty: Index value '" + index + "' not in range [0.." + (this._codingSchemeWithTypeList.size() - 1) + "]");
      }

      this._codingSchemeWithTypeList.set(index, vCodingSchemeWithType);
  }

  /**
   * @param vCodingSchemeWithTypeyArray
   */
  public void setCodingSchemeWithType(
          final org.lexevs.dao.index.access.codingschemewithtype.CodingSchemeWithType[] vCodingSchemeWithTypeArray) {
      //-- copy array
      _codingSchemeWithTypeList.clear();

      for (int i = 0; i < vCodingSchemeWithTypeArray.length; i++) {
              this._codingSchemeWithTypeList.add(vCodingSchemeWithTypeArray[i]);
      }
  }

}
