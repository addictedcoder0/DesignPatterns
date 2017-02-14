package com.pattern.ObserverPattern;



public interface Subject {

		public void registerObserver(CurrentConditionsDisplay currentConditionsDisplay);
		public void removeObserver(Observer o);
		public void notifyObservers();
}
