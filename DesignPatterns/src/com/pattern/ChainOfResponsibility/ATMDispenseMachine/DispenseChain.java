package com.pattern.ChainOfResponsibility.ATMDispenseMachine;

public interface DispenseChain {
	 
    void setNextChain(DispenseChain nextChain);
     
    void dispense(Currency cur);
}