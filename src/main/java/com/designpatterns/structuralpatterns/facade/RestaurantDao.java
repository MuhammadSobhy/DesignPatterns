package com.designpatterns.structuralpatterns.facade;

public class RestaurantDao {

	public Restaurant getRestaurant (String restaurantName) {
		return new Restaurant();
	}
}
