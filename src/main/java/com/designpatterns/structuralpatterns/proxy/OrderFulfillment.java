package com.designpatterns.structuralpatterns.proxy;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class OrderFulfillment implements IOrder {

	List<Warehouse> warehouses;
	
	@Override
	public void fulfillOrder(Order order) {
		// We can improve the code below but the main idea is that we will not call the 
		// real warehouse until we are sure it will fulfill the order successfully
		Hashtable<Warehouse, Order> warehousesOrders = new Hashtable<>();
		for (Item item : order.getItems()) {
			for (Warehouse warehouse : warehouses) {
				if (warehouse.currentInventory(item) > 0) {
					if(warehousesOrders.containsKey(warehouse)) {
						warehousesOrders.get(warehouse).getItems().add(item);
					} else {
						 List <Item> items = new ArrayList<Item>();
						 warehousesOrders.put(warehouse, new Order(items));
					}
				}
			}
		}
		
		for (Map.Entry<Warehouse,Order> warehouseOrder : warehousesOrders.entrySet()) {
			warehouseOrder.getKey().fulfillOrder(warehouseOrder.getValue());
		}
	}

}
