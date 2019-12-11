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

import com.neo.mojo.model.Deliver;
import com.neo.mojo.repository.DeliverRepository;
import com.neo.mojo.service.DeliverService;

@RestController
@RequestMapping("/deliver")
public class DeliverController {

	@Autowired
	DeliverRepository deliverRepository;

	@Autowired
	DeliverService deliverService;

	@PostMapping("/create")
	public Deliver create(@RequestBody Deliver deliver) {
		deliverService.save(deliver);
		return deliver;
	}

	@PutMapping("/{id}")
	public Deliver updateDeliver(@RequestBody Deliver deliver, @PathVariable String id) {
		deliver.setId(id);
		deliverService.save(deliver);
		return deliver;
	}

	@DeleteMapping("/{id}")
	public String deleteDeliver(@PathVariable String id) {
		deliverService.deleteById(id);
		return id;
	}

	@GetMapping
	public List getDeliver() {
		return deliverService.findAll();
	}

	@GetMapping("{orderNumber}/no")
	public Deliver listDeliver(@PathVariable String orderNumber) {
		return deliverRepository.findDeliveredByOrdernumber(orderNumber);
	}
}
