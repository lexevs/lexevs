package org.cts2.internal.model.uri;

import org.LexGrid.LexBIG.Extensions.Generic.MappingExtension.Mapping;
import org.cts2.core.types.SetOperator;
import org.cts2.internal.model.uri.restrict.NonIterableBasedResolvingRestrictionHandler;
import org.cts2.service.core.ReadContext;
import org.cts2.uri.DirectoryURI;
import org.cts2.uri.MapVersionDirectoryURI;
import org.cts2.uri.restriction.RestrictionState;

public class DefaultMapVersionDirectoryURI extends AbstractNonIterableLexEvsBackedResolvingDirectoryURI<Mapping,MapVersionDirectoryURI>implements MapVersionDirectoryURI{

	protected DefaultMapVersionDirectoryURI(
			NonIterableBasedResolvingRestrictionHandler<Mapping, MapVersionDirectoryURI> restrictionHandler) {
		super(restrictionHandler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RestrictionState<? extends DirectoryURI> getRestrictionState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Mapping getOriginalState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected <O> O transform(Mapping lexevsObject, Class<O> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected MapVersionDirectoryURI clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int doCount(ReadContext readContext) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected MapVersionDirectoryURI createSetOperatedDirectoryURI(
			SetOperator setOperator, MapVersionDirectoryURI directoryUri1,
			MapVersionDirectoryURI directoryUri2) {
		// TODO Auto-generated method stub
		return null;
	}


}
