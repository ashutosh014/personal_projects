package com.ashutosh.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.transaction.annotation.Transactional;

import com.ashutosh.entity.PizzaEntity;

@RepositoryDefinition(idClass = Integer.class, domainClass = PizzaEntity.class)
@Transactional(value = "txManager")
public interface PizzaDAO {
	@Query(name = "PIZZA.query1_findAllPizzaDetails")
	List<PizzaEntity> findAllPizzaDetails();
	
}
