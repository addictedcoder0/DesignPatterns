package com.pattern.AdapterPattern.Duck;

public class TestDrive {

		public static void main(String[] args){
			Duck duck = new MallardDuck();
			Turkey turkey=new WildTurkey();
			
			Duck turkeyAdapter=new TurkeyAdapter(turkey);
			
			
			duck.quack();
			duck.fly();
			
			turkeyAdapter.quack();
			turkeyAdapter.fly();
		}
}
