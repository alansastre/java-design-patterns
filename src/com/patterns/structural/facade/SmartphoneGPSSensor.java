package com.patterns.structural.facade;

public class SmartphoneGPSSensor implements SmartphoneSensor{
    @Override
    public void start() {
        System.out.println("GPS started");
    }

    @Override
    public void stop() {
        System.out.println("GPS stopped");
    }
}
