package com.patterns.behavioral.strategy.strategy1;

/**
 * Patrón strategy o patrón estrategia
 *
 * Contexto
 * Estrategia
 *      Estrategia concreta
 */
public class Main {

    public static void main(String[] args) {

        ShopCart cart = new ShopCart();

        Product product1 = new Product("1422342342DSFDSF", 9.99);
        Product product2 = new Product("1422342342DSFDSF", 99.99);

        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.pay(new PaypalStrategy("","",""));
        cart.pay(new CreditCardStrategy("","","", ""));
    }
}
