package com.pattern.ObserverPattern.Shop_Notify_me;

import java.util.ArrayList;

public class Product implements Subject{

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String  productName;
	private String  productType;
	private String  productPrice;
	private String  availability;
	
	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		System.out.println("Availability changed from NOT AVAILABLE --> AVAILABLE ");
		notifyObserver();
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	
	
	public Product(String productName , String productType , String productPrice , String availability)
	{
		super();
		this.productName = productName;
		this.productType = productType;
		this.productPrice = productPrice;
		this.availability = availability ;
	}
	
	@Override
	public void registerObserver(Observer observer) {
	 observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		System.out.println(" Product Name :"+this.getProductName()+"product is available now ");
		System.out.println();
		for (Observer observer:observers)
			
		{
			observer.update(this.availability);
		}
		
	}

}
