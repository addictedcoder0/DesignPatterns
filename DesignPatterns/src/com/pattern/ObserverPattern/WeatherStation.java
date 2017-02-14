package com.pattern.ObserverPattern;

public class WeatherStation {
	public static void main(String[] args)
	{
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
		// Dummy Value feed up 
		weatherData.setMeasurements(80f, 65f, 30.4f);
		weatherData.setMeasurements(85f, 75f, 10.4f);
		weatherData.setMeasurements(90f, 90f, 50.4f);
		
	}

}
