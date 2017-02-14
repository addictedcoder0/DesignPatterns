package com.pattern.StatePattern.States;

import com.pattern.StatePattern.ATMMachine;
import com.pattern.StatePattern.ATMState;

public class HasPin implements ATMState{
	ATMMachine atmMachine;
	public HasPin(ATMMachine atmMachine){
		this.atmMachine=atmMachine;
	}
	public void insertCard() {
			System.out.println("can't enter more than one card");
	}
	public void ejectCard() {
		System.out.println("card ejected");
		atmMachine.setAtmState(atmMachine.getNoCardState());
	}
	public void insertPin(int pinEntered) {
		System.out.println("already entered");
	}
	public void requestCash(int Amount) {
		if(Amount > atmMachine.cashInMachine){
			System.out.println("sorry we don't have sufficient amount");
			ejectCard();
		}
		else {
			System.out.println("kindly collect "+Amount+" Rs ");
			atmMachine.setCashInMachine(atmMachine.cashInMachine-Amount);
			ejectCard();
			if (atmMachine.cashInMachine <= 0){
				atmMachine.setAtmState(atmMachine.getNoCashState());
			}
		}
	}
}
