package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Bike;

public class BikeImpl implements Bike {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike engine stopped.");
    }

    @Override
    public void resetSystem() {
        System.out.println("Bike system reset.");
    }
}
