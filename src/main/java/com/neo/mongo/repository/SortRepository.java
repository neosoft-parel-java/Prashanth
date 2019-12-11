package com.neo.mongo.repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.neo.mongo.model.SortNumbers;

@Repository
public class SortRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	public SortNumbers save(SortNumbers sortNumbers) {
		mongoTemplate.save(sortNumbers);
		return sortNumbers;
	}

	public SortNumbers update(SortNumbers sortNumbers) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(sortNumbers.getId()));
		Update update = new Update();
		update.set("_1_10", sortNumbers.get_1_10());
		update.set("_11_20", sortNumbers.get_11_20());
		update.set("_21_10", sortNumbers.get_21_30());
		update.set("_31_40", sortNumbers.get_31_40());
		update.set("_41_50", sortNumbers.get_41_50());
		update.set("_51_60", sortNumbers.get_51_60());
		update.set("_61_70", sortNumbers.get_61_70());
		update.set("_71_80", sortNumbers.get_71_80());
		update.set("_81_90", sortNumbers.get_81_90());
		return mongoTemplate.findAndModify(query, update, SortNumbers.class);
	}

	public List findAll() {
		return mongoTemplate.findAll(SortNumbers.class);
	}

	public void deleteById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		mongoTemplate.remove(query, SortNumbers.class);

	}
}
