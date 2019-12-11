package com.neo.mojo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.neo.mojo.model.Order;

@Service
public class OrderService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public List findAll() {
		return mongoTemplate.findAll(Order.class);
	}

	public Order save(Order order) {
		mongoTemplate.save(order);
		return order;
	}

	public void deleteById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		mongoTemplate.remove(query, Order.class);
	}

}
