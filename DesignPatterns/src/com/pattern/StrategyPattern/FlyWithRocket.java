package com.pattern.StrategyPattern;

public class FlyWithRocket implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("flying using rocket propulsion");
	}

}
