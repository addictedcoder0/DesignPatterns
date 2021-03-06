package com.pattern.StatePattern;

import com.pattern.StatePattern.States.HasCard;
import com.pattern.StatePattern.States.HasPin;
import com.pattern.StatePattern.States.NoCard;
import com.pattern.StatePattern.States.NoCash;

public class ATMMachine {
	ATMState hasCard;
	ATMState hasPin;
	ATMState noCard;
	ATMState noCash;
	ATMState atmState;
	
	public void setAtmState(ATMState atmState) {
		this.atmState = atmState;
	}

	public int cashInMachine=2000;
	
	public void setCashInMachine(int cashInMachine) {
		this.cashInMachine = cashInMachine;
	}

	public boolean correctPinEntered=false;
	
	public ATMMachine(){
		hasCard=new HasCard(this);
		noCard=new NoCard(this);
		hasPin=new HasPin(this);
		noCash=new NoCash(this);
		
		atmState=noCard;
		if (cashInMachine <= 0){
			atmState=noCash;
			}
		}
	public void InsertCard(){
			atmState.insertCard();
		}
	public void ejectCard(){
		atmState.ejectCard();
	}
	
	public void requestCash(int cashToWithdraw){
		atmState.requestCash(cashToWithdraw);
	}
	
	public void insertPin(int pinEntered){
		atmState.insertPin(pinEntered);
	}

	public ATMState getYesCardState(){
		return hasCard;
	}
	
	public ATMState getNoCardState(){
		return noCard;
	}
	
	public ATMState getNoCashState(){
		return noCash;
	}
	
	public ATMState getHasPinState(){
		return hasPin;
	}
}
