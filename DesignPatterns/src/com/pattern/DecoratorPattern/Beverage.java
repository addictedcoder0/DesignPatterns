package com.pattern.DecoratorPattern;

public abstract class Beverage {

		String description = "unknown Beverage";
		public String getDescription()
		{
			return description;
		}
		public abstract double cost();
	}
