package com.pattern.factoryPattern;

public  class EnemyShip {
	private String name;
	private double amtDamage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmtDamage() {
		return amtDamage;
	}
	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}
	
	public void followHeroShip(){
		System.out.println(getName()+"is following the Hero");
	}
	public void displayEnemyShip(){
		System.out.println(getName()+" is on the screen");
	}
	public void enemyShipShoots(){
		System.out.println(getName()+" is shooting the enemy ship and have done the Damage"+getAmtDamage());
	}
	
}