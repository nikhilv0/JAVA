package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.WashingMachine;

public class WashingMachineImpl implements WashingMachine {
    @Override
    public void startCycle() {
        System.out.println("Washing machine cycle started.");
    }

    @Override
    public void stopCycle() {
        System.out.println("Washing machine cycle stopped.");
    }

    @Override
    public void drainWater() {
        System.out.println("Draining water from washing machine.");
    }
}
