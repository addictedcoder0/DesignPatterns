package com.pattern.VisitorPattern.Shopping;

public class Shirt extends Product{

	private String brandName;
	private String size;
	
	public Shirt(String brandName, String size , int price)
	{
		super();
		this.brandName=brandName;
		this.size=size;
		this.price=price;
		
	}
	
	public String getBrandName()
	{
		return brandName;
	}
	
	public String getSize()
	{
		return size;
	}
	@Override
	public void accept(ShoppingMallVisitor shoppingMallVisitor) {
		
		shoppingMallVisitor.visit(this);
	}

	public String toString()
	{
	 return "Shirt [ BrandName = "+brandName +" , size = "+size+" , price = "+price +" ] ";	
	}
}
