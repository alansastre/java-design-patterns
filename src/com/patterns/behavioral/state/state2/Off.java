package com.patterns.behavioral.state.state2;

public class Off extends RemoteControl{
    @Override
    public void toggle(Device device) {
        System.out.println("Turning ON the device.");
        device.setState(new On());
    }
}
