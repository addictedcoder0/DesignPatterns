package com.pattern.VisitorPattern.Shopping;

public abstract class Product {

	protected int price;
	public abstract void accept(ShoppingMallVisitor shoppingMallVisitor);
	public int getPrice()
	{
		return price;
	}
}
