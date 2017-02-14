package com.pattern.specific.BusinessDelegatePattern;

public class JMSService implements BusinessService {

	
	@Override
	public void doProcessing() {
		System.out.println("Processing the task by invoking JMS Services");
	}

}
