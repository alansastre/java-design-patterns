package com.patterns.behavioral.state.state2;

public class Device {

    private RemoteControl state;

    public Device(RemoteControl state){
        this.state = state;
    }
    public RemoteControl getState() {
        return state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }

    public void pressButton(){
        this.state.toggle(this);
    }
}
