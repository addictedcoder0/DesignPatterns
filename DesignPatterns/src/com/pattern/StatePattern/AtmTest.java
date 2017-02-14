package com.pattern.StatePattern;

public class AtmTest {

	public static void main(String[] args){
	ATMMachine atmMachine=new ATMMachine();
	atmMachine.InsertCard();
	atmMachine.ejectCard();
	atmMachine.InsertCard();
	atmMachine.insertPin(1234);
	atmMachine.requestCash(2000);
	atmMachine.InsertCard();
	atmMachine.insertPin(1234);
	}
	
}
