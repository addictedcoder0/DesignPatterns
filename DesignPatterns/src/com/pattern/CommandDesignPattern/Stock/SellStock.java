package com.pattern.CommandDesignPattern.Stock;

public class SellStock implements Order{
	
	private Stock stock;
	public SellStock(Stock stock) {
		// TODO Auto-generated constructor stub
	this.stock = new Stock();
	}
		
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.sell();
	}

}
