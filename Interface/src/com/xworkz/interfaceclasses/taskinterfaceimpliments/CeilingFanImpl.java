package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.CeilingFan;

public class CeilingFanImpl implements CeilingFan {
    @Override
    public void turnOnFan() {
        System.out.println("Ceiling fan turned on.");
    }

    @Override
    public void turnOffFan() {
        System.out.println("Ceiling fan turned off.");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Adjusting ceiling fan speed.");
    }

    @Override
    public void display() {
        CeilingFan.super.display();
    }
}
