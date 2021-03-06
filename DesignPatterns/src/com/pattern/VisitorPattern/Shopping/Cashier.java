package com.pattern.VisitorPattern.Shopping;

public class Cashier implements ShoppingMallVisitor{

	private String name;
	private int totalPrice =0;
	
	public Cashier(String name)
	{
		super();
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	@Override
	public void visit(Product product) {
		totalPrice = totalPrice + product.getPrice();
	}

}
