package com.pattern.TemplatePattern.Coffee;

public class NescafeCoffee extends CoffeeTemplate{

	@Override
	public void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("100 ml of water is boiled");
	}

	@Override
	public void addMilk() {
		// TODO Auto-generated method stub
		System.out.println("100 ml of milk is added");
	}

	@Override
	public void addSugar() {
		// TODO Auto-generated method stub
		System.out.println("100 g sugar added");
	}

	@Override
	public void addCoffeePowder() {
		// TODO Auto-generated method stub
		System.out.println("10 g of Nescafe coffee added");
	}

}
