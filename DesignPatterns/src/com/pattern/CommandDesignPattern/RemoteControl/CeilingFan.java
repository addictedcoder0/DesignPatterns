package com.pattern.CommandDesignPattern.RemoteControl;

public class CeilingFan {
	public static final int HIGH=3;
	public static final int MEDIUM=2;
	public static final int LOW=1;
	public static final int OFF=0;
	int speed;
	public CeilingFan(){
		speed=OFF;
	}
	
	public void high(){
		speed=HIGH;
		System.out.println(" Speed is HIGH");
	}
	
	public void medium(){
		speed=MEDIUM;
		System.out.println(" Speed is MEDIUM");
	}
	public void low(){
		speed=LOW;
		System.out.println(" Speed is LOW");
	}
	public void off(){
		speed=OFF;
		System.out.println(" fan is OFF");
	}
	public int prevSpeed(){
		return speed;
	}
}
