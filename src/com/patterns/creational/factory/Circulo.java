package com.patterns.creational.factory;

public class Circulo extends Figura{

    private int radio;
    public Circulo(){}
    public Circulo(int radio){
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                "} " + super.toString();
    }
}
