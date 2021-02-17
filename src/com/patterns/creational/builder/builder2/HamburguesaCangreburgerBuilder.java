package com.patterns.creational.builder.builder2;

/**
 * Builder concreto
 */
public class HamburguesaCangreburgerBuilder extends HamburguesaBuilder{


    public HamburguesaCangreburgerBuilder(){
        super.hamburguesa = new Hamburguesa();
    }
    @Override
    public void buildPan() {
        this.hamburguesa.setPan("Pan mojado");
    }

    @Override
    public void buildCarne() {
        this.hamburguesa.setCarne("Crustaceos");

    }

    @Override
    public void buildSalsa() {
        this.hamburguesa.setSalsas("Salsa marina");

    }

    @Override
    public void buildPatatas() {
        this.hamburguesa.setPatatas("Algas");

    }
}
