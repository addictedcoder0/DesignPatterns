package com.pattern.AdapterPattern.Duck;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("gobble gobble");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("i am flying short distance");
	}

}