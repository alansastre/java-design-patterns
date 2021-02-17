package com.patterns.structural.adapter;

/**
 * Adapter o Wrapper
 *
 * Roles:
 * Target
 * Adapter
 * Adaptee
 * Client o Main
 */
public class Main {

    public static void main(String[] args) {


        Movable car = new Car();
        car.speedUp(100);

        Movable kawasaki = new Motorcycle();
        kawasaki.speedUp(80);

        Movable tractor = new TractorAdapter();
        tractor.speedUp(100);

    }
}
