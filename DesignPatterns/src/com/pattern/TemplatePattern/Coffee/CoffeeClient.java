package com.pattern.TemplatePattern.Coffee;

public class CoffeeClient {

	public static void main(String[] args)
	{
		System.out.println("Bru coffee preparation");
		CoffeeTemplate coffeeTemplate = new BruCoffee();
		coffeeTemplate.prepareCoffee();
		
		System.out.println("******************************************\n\n Nescafe coffee preparation");
		coffeeTemplate = new NescafeCoffee();
		coffeeTemplate.prepareCoffee();
	}
}
