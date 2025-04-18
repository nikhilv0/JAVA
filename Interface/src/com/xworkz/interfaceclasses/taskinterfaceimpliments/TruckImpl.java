package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Truck;

public class TruckImpl implements Truck {
    @Override
    public void startEngine() {
        System.out.println("Truck engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped.");
    }

    @Override
    public void resetSystem() {
        System.out.println("Truck system reset.");
    }

    @Override
    public void display() {
        Truck.super.display();
    }
}
