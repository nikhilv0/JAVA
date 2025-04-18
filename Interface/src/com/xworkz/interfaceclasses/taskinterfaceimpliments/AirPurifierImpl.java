package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.AirPurifier;

public class AirPurifierImpl implements AirPurifier {
    @Override
    public void purifyAir() {
        System.out.println("Purifying air");
    }

    @Override
    public void changeFilter() {
        System.out.println("Changing filter");
    }

    @Override
    public void adjustFanSpeed() {
        System.out.println("Adjusting fan speed");
    }

    @Override
    public void display() {
        AirPurifier.super.display();
    }
}

