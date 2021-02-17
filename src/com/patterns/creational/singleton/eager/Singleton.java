package com.patterns.creational.singleton.eager;

public class Singleton {

    private static final Singleton SINGLE_INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SINGLE_INSTANCE;
    }
}
