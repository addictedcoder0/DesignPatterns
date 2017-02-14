package com.pattern.VisitorPattern.Shopping;

public class Book extends Product {

	private String name;
	public String getName() {
		return name;
	}
	public String getIsbnNumber() {
		return isbnNumber;
	}
	private String isbnNumber;
	
	public Book(String name,String isbnNumber,int price)
	{
		super();
		this.name=name;
		this.isbnNumber=isbnNumber;
		this.price=price;
	}
	@Override
	public void accept(ShoppingMallVisitor shoppingMallVisitor) {
		
		shoppingMallVisitor.visit(this);
		
	}

}
