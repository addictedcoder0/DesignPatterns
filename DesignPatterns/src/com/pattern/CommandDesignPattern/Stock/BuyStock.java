package com.pattern.CommandDesignPattern.Stock;

public class BuyStock implements Order{
	
	private Stock stock;
	public BuyStock(Stock stock) {
		// TODO Auto-generated constructor stub
	this.stock = new Stock();
	}
		
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.buy();
	}

}
