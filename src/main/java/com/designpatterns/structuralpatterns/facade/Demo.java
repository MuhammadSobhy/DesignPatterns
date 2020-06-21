package com.designpatterns.structuralpatterns.facade;

public class Demo {

		
	public static void main (String args[]) {
		RestaurantFacade restaurantFacade = new RestaurantFacade();
		restaurantFacade.reserve("ABC", 2);
	}
}
