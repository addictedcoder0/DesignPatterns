package com.pattern.AdapterPattern.Duck;

public class TurkeyAdapter implements Duck{
	Turkey turkey ;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey=turkey;
		// TODO Auto-generated constructor stub
	}
	
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

	public void fly() {
		// TODO Auto-generated method stub
		turkey.fly();
	}

}
