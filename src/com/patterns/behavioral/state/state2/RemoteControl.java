package com.patterns.behavioral.state.state2;

public abstract class RemoteControl {

    /**
     * Turns On/Off based on previous state
     * @param device
     */
    public abstract void toggle(Device device);
}
