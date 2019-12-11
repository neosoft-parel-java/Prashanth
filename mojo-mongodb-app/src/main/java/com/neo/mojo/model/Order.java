package com.neo.mojo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Order")
public class Order {

	@Id
	private String id;
	private String orderNumber;
	private List kitchens;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List getKitchens() {
		return kitchens;
	}

	public void setKitchens(List kitchens) {
		this.kitchens = kitchens;
	}

	

}
