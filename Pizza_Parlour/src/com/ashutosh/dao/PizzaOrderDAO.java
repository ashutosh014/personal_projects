package com.ashutosh.dao;

import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.transaction.annotation.Transactional;

import com.ashutosh.entity.PizzaOrderEntity;

@RepositoryDefinition(idClass = Integer.class, domainClass = PizzaOrderEntity.class)
@Transactional(value = "txManager")
public interface PizzaOrderDAO {
	PizzaOrderEntity save(PizzaOrderEntity entity);
}
