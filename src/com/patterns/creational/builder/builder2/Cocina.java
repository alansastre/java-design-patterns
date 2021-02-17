package com.patterns.creational.builder.builder2;

/**
 * Director
 */
public class Cocina {

    private HamburguesaBuilder builder;

    public Hamburguesa getHamburguesa(){
        return builder.getHamburguesa();
    }
    public void setBuilder(HamburguesaBuilder builder){
        this.builder = builder;
    }

    public void build(){
        this.builder.buildPan();
        this.builder.buildCarne();
        this.builder.buildSalsa();
        this.builder.buildPatatas();
    }



}
