package com.patterns.creational.factory;

public class Triangulo extends Figura{

    private int base;
    private int altura;

    public Triangulo(){}

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (this.base * this.altura) / 2.0;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                "} " + super.toString();
    }
}
