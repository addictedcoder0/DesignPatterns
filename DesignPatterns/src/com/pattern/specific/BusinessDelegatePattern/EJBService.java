package com.pattern.specific.BusinessDelegatePattern;

public class EJBService implements BusinessService {

	
	@Override
	public void doProcessing() {
		System.out.println("Processing the task by invoking EJB Services");
	}

}
