package com.neo.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.mongo.model.SortNumbers;
import com.neo.mongo.repository.SortRepository;

@RestController
@RequestMapping("/sort")
public class SortController {
	
	@Autowired
	SortRepository sortRepository;
	
	@PostMapping
	public SortNumbers createDept(@RequestBody SortNumbers sortNumbers) {
		sortRepository.save(sortNumbers);
		return sortNumbers;
	}
	
	@PutMapping("/{id}")
    public SortNumbers updateDept(@RequestBody SortNumbers sortNumbers, @PathVariable String id) {
		sortNumbers.setId(id);
        sortRepository.update(sortNumbers);
        return sortNumbers;
    }

	@GetMapping
	public List listDepts(){
	    return sortRepository.findAll();
	 }
	
	@DeleteMapping("/{id}")
    public String deleteDept(@PathVariable String id) {
		sortRepository.deleteById(id);
        return id;
    }
}
