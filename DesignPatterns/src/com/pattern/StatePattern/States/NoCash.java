package com.pattern.StatePattern.States;

import com.pattern.StatePattern.ATMMachine;
import com.pattern.StatePattern.ATMState;

public class NoCash implements ATMState{

	ATMMachine atmMachine;
	public NoCash(ATMMachine atmMachine){
		this.atmMachine=atmMachine;
	}
	public void insertCard() {
		System.out.println("we don't have enough money");
		}
	public void ejectCard() {
		System.out.println("we don't have enough cash");
	}
	public void insertPin(int pinEntered) {
		System.out.println("we don't have enough cash");
	}
	public void requestCash(int Amount) {
		System.out.println("we don't have enough cash");
	}
}
