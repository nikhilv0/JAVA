package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Bus;

public class BusImpl implements Bus {
    @Override
    public void startEngine() {
        System.out.println("Bus engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bus engine stopped.");
    }

    @Override
    public void resetSystem() {
        System.out.println("Bus system reset.");
    }
}
