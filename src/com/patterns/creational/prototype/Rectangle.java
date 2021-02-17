package com.patterns.creational.prototype;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(String color, int width, int height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
