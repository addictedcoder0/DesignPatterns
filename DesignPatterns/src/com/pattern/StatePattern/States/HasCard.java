package com.pattern.StatePattern.States;

import com.pattern.StatePattern.ATMMachine;
import com.pattern.StatePattern.ATMState;

public class HasCard implements ATMState{
	ATMMachine atmMachine;
	public HasCard(ATMMachine atmMachine){
		this.atmMachine=atmMachine;
	}
	public void insertCard() {
		System.out.println("you can't enter more than one card");
		}
	public void ejectCard() {
	System.out.println("card ejected");
	atmMachine.setAtmState(atmMachine.getNoCardState());
	}
	public void insertPin(int pinEntered) {	
		if(pinEntered == 1234){
			System.out.println("correct Pin");
			atmMachine.correctPinEntered=true;
			atmMachine.setAtmState(atmMachine.getHasPinState());
		}
		else{
			System.out.println("you have entered a wrong pin");
			atmMachine.correctPinEntered=false;
			ejectCard();
		}
	}
	public void requestCash(int Amount) {
		System.out.println("enter pin first");
	}
}
