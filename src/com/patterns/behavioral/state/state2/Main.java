package com.patterns.behavioral.state.state2;

/**
 * GoF Definition: Allow an object to alter its behavior when its internal state changes. The object will appear to
 * change its class.
 */
public class Main {

    public static void main(String[] args) {
        Off initialState = new Off();
        Device device = new Device(initialState);

        device.pressButton();

        device.pressButton();
    }
}
