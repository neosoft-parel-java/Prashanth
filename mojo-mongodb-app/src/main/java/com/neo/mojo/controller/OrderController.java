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

import com.neo.mojo.model.Order;
import com.neo.mojo.repository.OrderRepository;
import com.neo.mojo.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	OrderService orderService;

	@PostMapping("/create")
	public Order create(@RequestBody Order order) {
		orderService.save(order);
		return order;
	}

	@PutMapping("/{id}")
	public Order updateOrder(@RequestBody Order order, @PathVariable String id) {
		order.setId(id);
		orderService.save(order);
		return order;
	}

	@DeleteMapping("/{id}")
	public String deleteOrder(@PathVariable String id) {
		orderService.deleteById(id);
		return id;
	}

	@GetMapping
	public List getOrder() {
		return orderService.findAll();
	}

	@GetMapping("{name}/name")
	public Order listDept(@PathVariable String name) {
		return orderRepository.findOrderByName(name);
	}
}
