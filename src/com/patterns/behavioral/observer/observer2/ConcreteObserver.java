package com.patterns.behavioral.observer.observer2;

public class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name){
        this.name = name;
    }

    @Override
    public void notify(String handle, String tweet) {
        System.out.printf("'%s' received Tweet notification from: '%s', Tweet message: '%s'\n", name, handle, tweet);
    }
}
