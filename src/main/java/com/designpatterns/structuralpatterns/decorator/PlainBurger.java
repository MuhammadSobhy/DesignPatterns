package com.designpatterns.structuralpatterns.decorator;

public class PlainBurger implements Burger{

	@Override
	public void prepare() {
		System.out.println("plain burger");		
	}

}
