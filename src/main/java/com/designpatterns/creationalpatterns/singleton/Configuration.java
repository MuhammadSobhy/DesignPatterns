package com.designpatterns.creationalpatterns.singleton;

/*
 * Application should have one object of the Configuration class. 
 */
public class Configuration {
	
	private static Configuration uniqueInstance;
	
	private Configuration () {}
	

	public static Configuration getInstance() {
		if (uniqueInstance == null) {
			synchronized(Configuration.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Configuration();
				}
			}
		}
		return uniqueInstance;
	}
	
}