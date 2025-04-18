package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Scooter;

public class ScooterImpl implements Scooter {
    @Override
    public void startEngine() {
        System.out.println("Scooter engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Scooter engine stopped.");
    }

    @Override
    public void resetSystem() {
        System.out.println("Scooter system reset.");
    }

    @Override
    public void display() {
        Scooter.super.display();
    }
}
