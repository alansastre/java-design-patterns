package com.patterns.behavioral.state.state1;

public class DeviceContext implements State{

    private State deviceState;

    public State getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(State deviceState) {
        this.deviceState = deviceState;
    }

    @Override
    public void doAction() {
        this.deviceState.doAction();
    }
}
