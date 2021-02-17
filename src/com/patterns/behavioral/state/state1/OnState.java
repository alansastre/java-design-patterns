package com.patterns.behavioral.state.state1;

public class OnState implements State{
    @Override
    public void doAction() {
        System.out.println("Encendiendo!");
    }
}
