package com.patterns.creational.factory;

public class Rectangulo extends Figura{

    // 1. atributos
    private int lado1;
    private int lado2;

    // 2. Constructor

    public Rectangulo(){}
    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    // 3. comportamiento

    @Override
    public double area() {
        return this.lado1 * this.lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                "} " + super.toString();
    }
}
