package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Humidifier;

public class HumidifierImpl implements Humidifier {
    @Override
    public void releaseMist() {
        System.out.println("Releasing mist.");
    }

    @Override
    public void setHumidityLevel() {
        System.out.println("Setting humidity level.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off humidifier.");
    }
}
