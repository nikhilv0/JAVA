package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Ship;

public class ShipImpl implements Ship {
    @Override
    public void startEngine() {
        System.out.println("Ship engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Ship engine stopped.");
    }

    @Override
    public void resetSystem() {
        System.out.println("Ship system reset.");
    }

    @Override
    public void display() {
        Ship.super.display();
    }
}
