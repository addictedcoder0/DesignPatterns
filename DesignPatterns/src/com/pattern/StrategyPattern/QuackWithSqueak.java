package com.pattern.StrategyPattern;

public class QuackWithSqueak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak Squeak");
	}

}
