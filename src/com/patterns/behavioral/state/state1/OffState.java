package com.patterns.behavioral.state.state1;

public class OffState implements State{
    @Override
    public void doAction() {
        System.out.println("Apagando!");
    }
}
