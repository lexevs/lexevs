package org.lexevs.dao.index.access.codingschemewithtype;

import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeSummary;

public class CodingSchemeWithType extends CodingSchemeSummary {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Flag to determine if this coding scheme is a resolved value set.
	 */
	private java.lang.Boolean _isResolvedValueSet;

	public CodingSchemeWithType() {
		super();
	}

	public java.lang.Boolean getCodingSchemeIsResolvedValueSet() {
		return this._isResolvedValueSet;
	}

	public void setCodingSchemeIsResolvedValueSet(final java.lang.Boolean isResolvedValueSet) {
		this._isResolvedValueSet = isResolvedValueSet;
	}

}
