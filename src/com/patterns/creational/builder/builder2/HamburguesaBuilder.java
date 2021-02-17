package com.patterns.creational.builder.builder2;

/**
 * Abstract Builder
 */
public abstract class HamburguesaBuilder {

    protected Hamburguesa hamburguesa;

    public Hamburguesa getHamburguesa(){
        return hamburguesa;
    }

    // metodos abstractos para la construccion de la hamburguesa

    public abstract void buildPan();
    public abstract void buildCarne();
    public abstract void buildSalsa();
    public abstract void buildPatatas();

}
