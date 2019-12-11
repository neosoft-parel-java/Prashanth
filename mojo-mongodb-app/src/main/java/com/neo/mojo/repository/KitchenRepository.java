package com.neo.mojo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.neo.mojo.model.Kitchen;
import com.neo.mojo.model.Order;

@Repository
public interface KitchenRepository extends MongoRepository<Order, Object>{

	@Query(value = "{'orders.orderNumber': ?0}", fields = "{'orders' : 0}")
	Kitchen findOrderByKitchenItem(String item);
}
