package com.patterns.creational.factory;

public class FiguraFactory {

    public static Figura crearFigura(String tipo){

        switch(tipo){
            case "rectangulo":
                 return new Rectangulo();
//                 return new RectanguloV2();
            case "circulo":
                return new Circulo();
            case "triangulo":
                return new Triangulo();
            default:
                return new Rectangulo();
        }


    }
}
