package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SolarPanelSystem;

public class SolarPanelSystemImpl implements SolarPanelSystem {
    @Override
    public void generatePower() {
        System.out.println("Solar panels are generating power.");
    }

    @Override
    public void storeEnergy() {
        System.out.println("Energy stored in solar batteries.");
    }

    @Override
    public void trackSunlight() {
        System.out.println("Tracking sunlight for optimal positioning.");
    }
}
