package com.patterns.behavioral.strategy.strategy2;

public class UpperCaseStrategy implements ValidationStrategy{

    @Override
    public boolean execute(String string) {
        return string.matches("[A-Z]+");
    }
}
