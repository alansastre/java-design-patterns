package com.patterns.structural.decorator;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing rectangle");

    }

    @Override
    public String description() {
        return "Hey there! I'm using Decorator!";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
