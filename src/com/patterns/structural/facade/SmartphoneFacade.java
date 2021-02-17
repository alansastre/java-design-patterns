package com.patterns.structural.facade;

import java.util.Arrays;
import java.util.List;

public class SmartphoneFacade {

    public Smartphone start(){
        Battery battery = new Battery();
        battery.on();

        // todo - check sim

        CPU cpu = new CPU();
        cpu.bootLoad();

        SmartphoneSensor gps = new SmartphoneGPSSensor();
        gps.start();

        SmartphoneSensor nfc = new SmartphoneNFCSensor();
        nfc.start();

        List<SmartphoneSensor> sensors = Arrays.asList(gps, nfc);

        return new Smartphone(battery, cpu, sensors);

    }

    public boolean stop(Smartphone smartphone){


        for (SmartphoneSensor sensor: smartphone.getSensors())
            sensor.stop();

        smartphone.getCpu().shutDown();
        smartphone.getBattery().off();
        return true;

    }
}
