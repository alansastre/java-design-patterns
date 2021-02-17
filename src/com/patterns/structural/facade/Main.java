package com.patterns.structural.facade;

/**
 * Patrón Facade o Fachada
 *
 * Facade
 * Subclases
 * Cliente o Main
 */
public class Main {

    public static void main(String[] args) {

        SmartphoneFacade facade = new SmartphoneFacade();
        Smartphone oneplus = facade.start();

        System.out.println("=============");

        System.out.println(oneplus);

        System.out.println("=============");
        facade.stop(oneplus);
    }
}
