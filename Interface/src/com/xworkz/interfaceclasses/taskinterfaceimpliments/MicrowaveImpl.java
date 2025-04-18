package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Microwave;

public class MicrowaveImpl implements Microwave {
    @Override
    public void startHeating() {
        System.out.println("Microwave heating started.");
    }

    @Override
    public void stopHeating() {
        System.out.println("Microwave heating stopped.");
    }

    @Override
    public void setTimer() {
        System.out.println("Setting microwave timer.");
    }

    @Override
    public void display() {
        Microwave.super.display();
    }
}
