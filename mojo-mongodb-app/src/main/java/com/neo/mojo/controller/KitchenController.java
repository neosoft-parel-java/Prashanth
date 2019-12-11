package com.neo.mojo.controller;

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

import com.neo.mojo.model.Kitchen;
import com.neo.mojo.repository.KitchenRepository;
import com.neo.mojo.service.KitchenService;

@RestController
@RequestMapping("/kitchen")
public class KitchenController {

	@Autowired
	KitchenRepository kitchenRepository;

	@Autowired
	KitchenService kitchenService;

	@PostMapping("/create")
	public Kitchen create(@RequestBody Kitchen kitchen) {
		kitchenService.save(kitchen);
		return kitchen;
	}

	@PutMapping("/{id}")
	public Kitchen updatekitchen(@RequestBody Kitchen kitchen, @PathVariable String id) {
		kitchen.setId(id);
		kitchenService.save(kitchen);
		return kitchen;
	}

	@DeleteMapping("/{id}")
	public String deleteDeliver(@PathVariable String id) {
		kitchenService.deleteById(id);
		return id;
	}

	@GetMapping
	public List getDeliver() {
		return kitchenService.findAll();
	}

	@GetMapping("{orderNumber}/item")
	public Kitchen listkitchen(@PathVariable String orderNumber) {
		return kitchenRepository.findOrderByKitchenItem(orderNumber);
	}
}
