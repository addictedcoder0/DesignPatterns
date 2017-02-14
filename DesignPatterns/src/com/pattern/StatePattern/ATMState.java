package com.pattern.StatePattern;
//this is the STATE , encapsulate the behavior

public interface ATMState {
	public void insertCard();
	public void ejectCard();
	public void insertPin(int pinEntered);
	public void requestCash(int Amount);
}
