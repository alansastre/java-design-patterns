package com.patterns.behavioral.observer.observer2;

public interface Subject {

    public void addSubscriber(Observer observer);
    public void removeSubscriber(Observer observer);
    public void notifySubscribers(String tweet);
}
