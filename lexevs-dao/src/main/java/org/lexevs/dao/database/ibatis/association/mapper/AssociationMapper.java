package org.lexevs.dao.database.ibatis.association.mapper;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.lexevs.dao.database.ibatis.association.parameter.InsertAssociationPredicateBean;
import org.lexevs.dao.database.inserter.Inserter;

@Mapper
public interface AssociationMapper {
	
    @InsertProvider(type=Inserter.class, method="insert")
    int insert(InsertStatementProvider<InsertAssociationPredicateBean> insertStatement);

}
