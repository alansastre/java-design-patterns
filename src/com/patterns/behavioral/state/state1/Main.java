package com.patterns.behavioral.state.state1;

/**
 * Patrón State o patrón estado
 *
 *
 */
public class Main {

    public static void main(String[] args) {

        DeviceContext stateContext = new DeviceContext();

        // estados
        State start = new OnState();
        State stop = new OffState();

        stateContext.setDeviceState(start);
        stateContext.doAction();

        stateContext.setDeviceState(stop);
        stateContext.doAction();
    }
}
