package com.pattern.DecoratorPattern;

public class StarbuzzCoffee {

	public static void main(String[] args){
		Beverage beverage=new Espresso();
		System.out.println(" "+beverage.getDescription()+"$"+beverage.cost());
		
		Beverage beverage2=new HouseBlend();
		beverage2=new Mocha(beverage2);
		beverage2=new Mocha(beverage2);
		System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
		
		Beverage beverage3=new DarkCoffee();
		beverage3=new Whip(beverage3);
		System.out.println(" "+beverage3.getDescription()+"$"+beverage3.cost());
		
	}
}
