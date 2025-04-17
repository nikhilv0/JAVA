package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartSprinkler;

public class SmartSprinklerImpl implements SmartSprinkler {
    @Override
    public void startSprinkling() {
        System.out.println("Starting sprinkler.");
    }

    @Override
    public void stopSprinkling() {
        System.out.println("Stopping sprinkler.");
    }

    @Override
    public void scheduleWatering() {
        System.out.println("Scheduling watering.");
    }
}
