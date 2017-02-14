package com.pattern.VisitorPattern.Shopping;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class Client {

	public static void main(String[] args)
	{
		LinkedHashMap<String, Product> productMap = ShoppingMallProducts.productMap;
		Set<String> products = productMap.keySet();
		System.out.println("Product Available");
		for (String string: products)
		{
			System.out.println(productMap.get(string));
		}
		System.out.println("\n ###################################################### \n");
		ArrayList<Product> purchasedProductList = new ArrayList<Product>();
		purchasedProductList.add(productMap.get("weareback"));
		purchasedProductList.add(productMap.get("kidsstory"));
		purchasedProductList.add(productMap.get("terminator"));
		purchasedProductList.add(productMap.get("peterengland"));
		
		ShoppingMallProducts shoppingMallProducts = new ShoppingMallProducts();
		System.out.println("Total Amount : "+shoppingMallProducts.getTotalAmount(purchasedProductList)+"Rs");
		
	}
}
