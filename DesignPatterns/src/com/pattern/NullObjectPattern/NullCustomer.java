package com.pattern.NullObjectPattern;

public class NullCustomer extends AbstractCustomer {

	
	public boolean isNil() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "NOT AVAILABLE";
	}

}
