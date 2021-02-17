package com.patterns.behavioral.strategy.strategy2;

public class Context {
    private final ValidationStrategy strategy;

    public Context(ValidationStrategy strategy){
        this.strategy = strategy;
    }

    public boolean validate(String string){
        return this.strategy.execute(string);
    }
}
