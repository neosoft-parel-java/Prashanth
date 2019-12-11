package com.neo.mojo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Kitchen")
public class Kitchen {

	@Id
	private String id;
	private String vegtItems;
	private String nonVegItems;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVegtItems() {
		return vegtItems;
	}

	public void setVegtItems(String vegtItems) {
		this.vegtItems = vegtItems;
	}

	public String getNonVegItems() {
		return nonVegItems;
	}

	public void setNonVegItems(String nonVegItems) {
		this.nonVegItems = nonVegItems;
	}

}
