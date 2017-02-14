package com.pattern.CommandDesignPattern.Stock;

public class Stock {

	private String stockName="ABC";
	private int quantity = 10;
	
	public void sell(){
		System.out.println("quantity :"+quantity +" of the Stock :"+stockName+" has been sold");
	}
	
	public void buy(){
		System.out.println("quantity :"+quantity +" of the Stock :"+stockName+" has been bought");
	}
}
