package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Helicopter;

public class HelicopterImpl implements Helicopter {
    @Override
    public void startEngine() {
        System.out.println("Helicopter engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Helicopter engine stopped.");
    }

    @Override
    public void resetSystem() {
        System.out.println("Helicopter system reset.");
    }
}
