package com.patterns.structural.facade;

import java.util.List;

public class Smartphone {

    private Battery battery;
    private CPU cpu;
    private List<SmartphoneSensor> sensors;

    public Smartphone(Battery battery, CPU cpu, List<SmartphoneSensor> sensors) {
        this.battery = battery;
        this.cpu = cpu;
        this.sensors = sensors;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public List<SmartphoneSensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<SmartphoneSensor> sensors) {
        this.sensors = sensors;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "battery=" + battery +
                ", cpu=" + cpu +
                ", sensors=" + sensors +
                '}';
    }
}
