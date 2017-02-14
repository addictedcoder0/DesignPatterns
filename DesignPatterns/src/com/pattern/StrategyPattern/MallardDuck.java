package com.pattern.StrategyPattern;

public class MallardDuck extends Duck{

	public MallardDuck() {
	flyBehavior=new FlyWithWings();
	quackBehavior=new QuackWithSound();
		
	}
	
	@Override
	public void display() {
		System.out.println("Mallard Duck");
		
	}

	public static void main(String[] args)
	{
		MallardDuck mallardDuck=new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.setFlyBehavior(new FlyWithRocket());
		mallardDuck.performFly();
		mallardDuck.setQuackBehavior(new QuackWithSqueak());
		mallardDuck.performQuack();
	}
	
}
