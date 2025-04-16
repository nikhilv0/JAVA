package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.InductionCooktop;

public class InductionCooktopImpl implements InductionCooktop {
    @Override
    public void turnOnCooktop() {
        System.out.println("Turning on induction cooktop.");
    }

    @Override
    public void setHeatLevel() {
        System.out.println("Setting heat level.");
    }

    @Override
    public void turnOffCooktop() {
        System.out.println("Turning off induction cooktop.");
    }
}
