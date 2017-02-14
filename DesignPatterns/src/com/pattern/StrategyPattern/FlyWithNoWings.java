package com.pattern.StrategyPattern;

public class FlyWithNoWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("no flying");
		
	}

}
