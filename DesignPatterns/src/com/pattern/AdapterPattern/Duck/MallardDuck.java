package com.pattern.AdapterPattern.Duck;

public class MallardDuck implements Duck{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("quack quack");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("i am flying");
	}

}
