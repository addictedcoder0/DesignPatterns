package com.pattern.VisitorPattern.Shopping;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ShoppingMallProducts {

	static LinkedHashMap<String, Product> productMap;
	static{
		productMap = new LinkedHashMap<String , Product>();
		Book weAreBack = new Book("we are Back","ISBN-999",200);
		Book KidsStory = new Book("KidsStory","ISBN-1991",150);
		Book moralStory = new Book("Moral Story","ISBN-2991",250);
		
		DVD DieHard = new DVD("DieHard", 1500);
		DVD terminator = new DVD("Terminator", 2500);
		DVD HarryPotter = new DVD("HarryPotter", 1900);
		
		Shirt zeroShirt = new Shirt("Zero","42",1500);
		Shirt peterEngland = new Shirt("PeterEngland","42",2500);
		Shirt JohnPlayer = new Shirt("johnPlayer","42",2000);
			
		productMap.put("weareback",weAreBack);
		productMap.put("kidsstory",KidsStory);
		productMap.put("moralstory",moralStory);
		productMap.put("diehard",DieHard);
		productMap.put("terminator",terminator);
		productMap.put("harrypotter",HarryPotter);
		productMap.put("zeroshirt",zeroShirt);
		productMap.put("peterengland",peterEngland);
		productMap.put("johnplayer",JohnPlayer);
	}
		public int getTotalAmount(ArrayList<Product> purchaseProductList)
		{
			Cashier cashier = new Cashier("john");
			System.out.println("purchase products details : \n");
			for(Product product : purchaseProductList)
			{
				product.accept(cashier);
				System.out.println(product + "\n");
				
			}
			return cashier.getTotalPrice();
		}
		
	}

