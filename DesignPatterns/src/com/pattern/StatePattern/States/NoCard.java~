package com.pattern.StatePattern.States;

import com.pattern.StatePattern.ATMMachine;
import com.pattern.StatePattern.ATMState;

public class NoCard implements ATMState{
	ATMMachine atmMachine;
	public NoCard(ATMMachine atmMachine){
		this.atmMachine=atmMachine;
	}
	public void insertCard() {
	System.out.println("enter the pin");
	atmMachine.setAtmState(atmMachine.getYesCardState());
	}
	public void ejectCard() {
		System.out.println("enter a card first");
	}
	public void insertPin(int pinEntered) {
		System.out.println("enter a card first");
	}
	public void requestCash(int Amount) {
		System.out.println("enter a card first");
	}
}
