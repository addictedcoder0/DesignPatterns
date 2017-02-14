package com.pattern.DecoratorPattern;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
		public Whip(Beverage beverage)
	{
		this.beverage=beverage;
		}
	public String getDescription() {
		
		return (beverage.getDescription()+",Whip");
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return (beverage.cost()+.99);
	}

}
