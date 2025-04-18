package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Tram;

public class TramImpl implements Tram {
    @Override
    public void startEngine() {
        System.out.println("Tram engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Tram engine stopped.");
    }

    @Override
    public void resetSystem() {
        System.out.println("Tram system reset.");
    }

    @Override
    public void display() {
        Tram.super.display();
    }
}
