package com.patterns.creational.factory;

public class Main {

    public static void main(String[] args) {

        Figura triangulo = FiguraFactory.crearFigura("triangulo");
        Figura circulo = FiguraFactory.crearFigura("circulo");
        Figura rectangulo = FiguraFactory.crearFigura("rectangulo");

        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(rectangulo);

    }
}
