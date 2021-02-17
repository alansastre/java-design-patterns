package com.patterns.behavioral.strategy.strategy2;

public class NumericStrategy implements ValidationStrategy {
    @Override
    public boolean execute(String string) {
        return string.matches("\\d+");
    }
}
