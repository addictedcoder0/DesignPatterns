package com.pattern.FactoryPattern;

public class NYstylePizzaStore extends PizzaStore {

public Pizza createPizza(String type) {
	if (type.equals("cheese")){
		return new NYstyleCheesePizza();
		}
	if (type.equals("veggie")){
		return new NYstyleVeggiePizza();
	}
	return null;
}
}
