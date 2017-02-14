package com.pattern.StrategyPattern;

public class QuackWithNoSound implements QuackBehavior{

	@Override
	public void quack() {
	 System.out.println("no sound");
		
	}

}
