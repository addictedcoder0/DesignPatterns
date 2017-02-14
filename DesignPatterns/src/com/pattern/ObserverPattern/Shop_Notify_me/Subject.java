package com.pattern.ObserverPattern.Shop_Notify_me;

public interface Subject {

	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver();
}
