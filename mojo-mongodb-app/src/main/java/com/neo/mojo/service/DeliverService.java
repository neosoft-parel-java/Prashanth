package com.neo.mojo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.neo.mojo.model.Deliver;

@Service
public class DeliverService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public List findAll() {
		return mongoTemplate.findAll(Deliver.class);

	}

	public Deliver save(Deliver deliver) {
		mongoTemplate.save(deliver);
		return deliver;

	}

	public void deleteById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		mongoTemplate.remove(query, Deliver.class);
	}

}
