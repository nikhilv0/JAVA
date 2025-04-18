package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartThermostat;

public class SmartThermostatImpl implements SmartThermostat {
    @Override
    public void setTemperature() {
        System.out.println("Temperature is set.");
    }

    @Override
    public void turnOnHeating() {
        System.out.println("Heating is turned on.");
    }

    @Override
    public void turnOffCooling() {
        System.out.println("Cooling is turned off.");
    }

    @Override
    public void display() {
        SmartThermostat.super.display();
    }
}
