package com.neo.mojo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.neo.mojo.model.Kitchen;
import com.neo.mojo.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Kitchen, Object>{
	@Query(value = "{'kitchens.name': ?0}", fields = "{'kitchens' : 0}")
	Order findOrderByName(String name);
}
