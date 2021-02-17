package com.patterns.behavioral.observer.observer2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    protected List<Observer> observers = new ArrayList<Observer>();
    protected String handle;

    public ConcreteSubject(String handle){
        this.handle = handle;
    }
    @Override
    public void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifySubscribers(String tweet) {
        for (Observer observer: this.observers) {
            observer.notify(this.handle, tweet);
        }
    }

    public void tweet(String tweet){
        notifySubscribers(tweet);
    }
}
