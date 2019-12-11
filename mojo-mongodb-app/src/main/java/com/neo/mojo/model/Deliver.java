package com.neo.mojo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Deliver")
public class Deliver {
	@Id
	private String id;
	private String deliverBoyName;
	@Indexed(name = "outOrderNumber")
	private String orderNumber;
	private String feedBack;
	private String rating;
	private List orders;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeliverBoyName() {
		return deliverBoyName;
	}

	public void setDeliverBoyName(String deliverBoyName) {
		this.deliverBoyName = deliverBoyName;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public List getOrders() {
		return orders;
	}

	public void setOrders(List orders) {
		this.orders = orders;
	}

}
