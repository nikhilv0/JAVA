package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.PowerInverter;

public class PowerInverterImpl implements PowerInverter {
    @Override
    public void convertPower() {
        System.out.println("Converting power.");
    }

    @Override
    public void switchMode() {
        System.out.println("Switching power mode.");
    }

    @Override
    public void displayStatus() {
        System.out.println("Displaying inverter status.");
    }
}
