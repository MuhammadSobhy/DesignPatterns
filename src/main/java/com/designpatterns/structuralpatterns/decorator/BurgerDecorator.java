package com.designpatterns.structuralpatterns.decorator;

public class BurgerDecorator implements Burger{

	private Burger burger;

	public BurgerDecorator(Burger burger) {
		super();
		this.burger = burger;
	}

	@Override
	public void prepare() {
		this.burger.prepare();
	}
	
	
}
