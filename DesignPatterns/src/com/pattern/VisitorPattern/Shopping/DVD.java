package com.pattern.VisitorPattern.Shopping;

public class DVD extends Product{

	private String name;
	public DVD(String name, int price)
	{
		super();
		this.name=name;
		this.price=price;
		
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public void accept(ShoppingMallVisitor shoppingMallVisitor )
	{
		shoppingMallVisitor.visit(this);
	}
	
	public String toString()
	{
		return " DVD [ name = "+name +" , price = "+price +" ]";
	}
}
