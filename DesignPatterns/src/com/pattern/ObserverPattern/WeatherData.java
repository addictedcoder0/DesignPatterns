package com.pattern.ObserverPattern;
import java.util.ArrayList;
public class WeatherData implements Subject{
	private ArrayList observers;
	private float temp;
	private float humidity;
	private float pressure;
	public WeatherData(){
		observers=new ArrayList();
	}
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	public void removeObserver(Observer o) 
	{
		int i =observers.indexOf(o);
		if (i >= 0){
			observers.remove(i);
		}
	}
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int i = 0;i<observers.size();i++)
		{
			Observer observer=(Observer)observers.get(i);
			observer.update(temp, humidity, pressure);
		}
	}
	public void measurementsChanged(){
		notifyObservers();
	}
	public void setMeasurements(float temp,float humidity,float pressure)
	{
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();	}
	@Override
	public void registerObserver(
			CurrentConditionsDisplay currentConditionsDisplay) {
		// TODO Auto-generated method stub
		
	} }
