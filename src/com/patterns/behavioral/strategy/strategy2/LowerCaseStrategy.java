package com.patterns.behavioral.strategy.strategy2;

public class LowerCaseStrategy implements ValidationStrategy {
    @Override
    public boolean execute(String string) {
        return string.matches("[a-z]+");
    }
}
