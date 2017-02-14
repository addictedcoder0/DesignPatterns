package com.pattern.StrategyPattern;

public class QuackWithSound implements QuackBehavior{

	@Override
	public void quack() {
	System.out.println("quack quack");
		
	}

}
