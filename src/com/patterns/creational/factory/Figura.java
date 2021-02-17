package com.patterns.creational.factory;

public abstract class Figura {


    public abstract double area();

    public Figura(){ }

    @Override
    public String toString() {
        return "Figura{}";
    }
}
