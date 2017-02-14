package com.pattern.ObserverPattern.Shop_Notify_me;

import com.pattern.ObserverPattern.Subject;

public class Person implements Observer {

	private String personName;
	
	public Person(String personName , Product samsungLEDTV)
	{
		this.personName=personName;
		samsungLEDTV.registerObserver(this);
	}
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public void update(String availability) {
		// TODO Auto-generated method stub

	}

}
