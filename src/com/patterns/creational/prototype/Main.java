package com.patterns.creational.prototype;

/**
 * Clonar
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {


        Shape rectangle = new Rectangle("negro", 200, 400);
        Shape pieza = rectangle.clone();

        Rectangle rectangle2 = new Rectangle("negro", 200, 400);
        Rectangle pieza2 = rectangle2.clone();
    }
}
