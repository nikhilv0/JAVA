package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.DigitalThermometer;

public class DigitalThermometerImpl implements DigitalThermometer {
    @Override
    public void measureTemperature() {
        System.out.println("Measuring temperature...");
    }

    @Override
    public void displayReading() {
        System.out.println("Displaying temperature reading.");
    }

    @Override
    public void resetDevice() {
        System.out.println("Thermometer reset to initial state.");
    }

    @Override
    public void display() {
        DigitalThermometer.super.display();
    }
}
