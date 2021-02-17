package com.patterns.structural.facade;

public class SmartphoneNFCSensor implements SmartphoneSensor{

    @Override
    public void start() {
        System.out.println("NFC started");
    }

    @Override
    public void stop() {
        System.out.println("NFC stopped");
    }
}
