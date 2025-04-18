package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartPlug;

public class SmartPlugImpl implements SmartPlug {
    @Override
    public void turnOn() {
        System.out.println("Smart plug turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart plug turned off.");
    }

    @Override
    public void monitorPowerUsage() {
        System.out.println("Monitoring power usage.");
    }

    @Override
    public void display() {
        SmartPlug.super.display();
    }
}
