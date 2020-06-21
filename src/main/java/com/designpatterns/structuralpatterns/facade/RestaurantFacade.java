package com.designpatterns.structuralpatterns.facade;

public class RestaurantFacade {

	RestaurantDao restaurantDao;
	
	public RestaurantFacade () {
		this.restaurantDao = new RestaurantDao();
	}
	
	public boolean reserve(String restaurantName , int numOfSeats) {
		Restaurant restaurant = restaurantDao.getRestaurant(restaurantName);
		if (restaurant.isSeatsAvailable(numOfSeats)) {
			return restaurant.reserve(numOfSeats);
		} else {
			return false;
		}
	}
}
