package org.LexGrid.lexevs.metabrowser.impl;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	MetaBrowserServiceImplTest.class,
	GetBySourceCountTest.class, 
	GetBySourceTabDisplayTest.class, 
	GetMetaTreeTest.class, 
	GetRelationshipCountTest.class,
	GetRelationshipTabDisplayTest.class,})
public class AllTests {
}

