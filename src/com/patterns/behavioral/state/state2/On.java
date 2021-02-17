package com.patterns.behavioral.state.state2;

public class On extends RemoteControl{
    @Override
    public void toggle(Device device) {
        System.out.println("Turning OFF the device.");
        device.setState(new Off());
    }
}
