package com.designpatterns.structuralpatterns.decorator;

public class Cheese extends BurgerDecorator {

	public Cheese(Burger burger) {
		super(burger);
	}
	
	public void prepare() {
		super.prepare();
		System.out.println("cheese");
	}

}
