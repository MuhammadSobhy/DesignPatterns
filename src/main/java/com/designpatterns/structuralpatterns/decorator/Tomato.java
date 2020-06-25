package com.designpatterns.structuralpatterns.decorator;

public class Tomato extends BurgerDecorator {

	public Tomato(Burger burger) {
		super(burger);
	}

	public void prepare() {
		super.prepare();
		System.out.println("tomato");
	}
}
