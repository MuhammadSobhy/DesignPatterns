package com.designpatterns.structuralpatterns.proxy;

import java.util.List;

public class Order {

	private List<Item> items;

	
	public Order(List<Item> items) {
		super();
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}
