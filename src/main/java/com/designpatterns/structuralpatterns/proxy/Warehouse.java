package com.designpatterns.structuralpatterns.proxy;

import java.util.Hashtable;

public class Warehouse implements IOrder {

	private Hashtable<Long, Long> stock;
	
	@Override
	public void fulfillOrder(Order order) {
		/*
		 * Process the order
		 */
	}
	
	public long currentInventory(Item item) {
		return stock.containsKey(item.getId()) ? stock.get(item.getId()) : 0;
	}

}
