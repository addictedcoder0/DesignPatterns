package com.pattern.factoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {

		public static void main(String[] args)
		
		{	EnemyShip enemyShip=null;
			EnemyShipFactory shipfactory=new EnemyShipFactory();
			System.out.println("enter your choice of ship");
			Scanner userInput=new Scanner(System.in);
			if (userInput.hasNext()){
				String typeofship = userInput.nextLine();
				enemyShip = shipfactory.makeEnemyShip(typeofship);
				userInput.close();
			}
			if (enemyShip!=null){
			doStuffEnemy(enemyShip);
			}
		}
		public static void doStuffEnemy(EnemyShip anEnemyShip){
			anEnemyShip.displayEnemyShip();
			anEnemyShip.followHeroShip();
			anEnemyShip.enemyShipShoots();
		}
}
