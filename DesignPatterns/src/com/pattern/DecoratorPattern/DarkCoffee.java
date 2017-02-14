package com.pattern.DecoratorPattern;

public class DarkCoffee extends Beverage{
   public DarkCoffee()
   {
	   description="DarkCoffee";
   }
	@Override
	public double cost() {
		
		return 2.0;
	}

	
}
