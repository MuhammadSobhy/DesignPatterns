package com.designpatterns.structuralpatterns.decorator;

public class Demo {

	public static void main(String[] args) {
		Burger burger = new PlainBurger();
		Cheese chese = new Cheese(burger);
		Tomato tomato = new Tomato(chese);
		tomato.prepare();
	}

}
