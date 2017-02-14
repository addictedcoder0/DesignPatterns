package com.pattern.TemplatePattern.Coffee;

public abstract class CoffeeTemplate {

	public final void prepareCoffee()
	{
		boilWater();
		addMilk();
		addSugar();
		addCoffeePowder();
		System.out.println("Hot Coffee ready ... ");
	}
	
	public abstract void boilWater();
	
	public abstract void addMilk();
	
	public abstract void addSugar();
	
	public abstract void addCoffeePowder();
		
}
