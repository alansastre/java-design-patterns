package com.patterns.creational.builder.builder2;

/**
 * Builder concreto
 */
public class HamburguesaYankeeBuilder extends HamburguesaBuilder{

    public HamburguesaYankeeBuilder(){
        super.hamburguesa = new Hamburguesa();
    }
    @Override
    public void buildPan() {
        this.hamburguesa.setPan("Pan rústico");
    }

    @Override
    public void buildCarne() {
        this.hamburguesa.setCarne("Carne punto menos");

    }

    @Override
    public void buildSalsa() {
        this.hamburguesa.setSalsas("Salsa hawaiana");

    }

    @Override
    public void buildPatatas() {
        this.hamburguesa.setPatatas("Patata rústica");

    }
}
