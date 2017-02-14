package com.pattern.ObserverPattern.Shop_Notify_me;

import java.util.ArrayList;
import java.util.Iterator;

public class ObserverPatternDemo {

	public static void main(String[] args)
	{
		Product samsungLEDTV = new Product("samsung lED TV","LED TV","60000 rs","Not AVAILABLE");
		
		// person Rudra will be created and it will be registered to the subject
		Person rudra = new Person("Rudra",samsungLEDTV);
		Person john = new Person("john",samsungLEDTV);
		ArrayList<Observer> subscribers = samsungLEDTV.getObservers();
		System.out.println("subscribers' list "+ subscribers);
		
		for (Iterator<Observer> iterator = subscribers.iterator(); iterator.hasNext();)
		{
			Person person = (Person)iterator.next();
			System.out.println("person has subscribed : "+person.getPersonName());
		}
			
		System.out.println();
		System.out.println("samsungLEDTV TV current status"+samsungLEDTV.getAvailability());
		System.out.println();
		
		samsungLEDTV.setAvailability("Available");
		
	}
}
