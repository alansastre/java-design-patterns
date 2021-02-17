package com.patterns.creational.prototype;

public abstract class Shape {

    private String color;

    public Shape(){}

    public Shape(String color){
        this.color= color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // clonar

    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}
