package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Refrigerator;

public class RefrigeratorImpl implements Refrigerator {
    @Override
    public void coolItems() {
        System.out.println("Cooling items in the refrigerator.");
    }

    @Override
    public void defrost() {
        System.out.println("Defrosting refrigerator.");
    }

    @Override
    public void checkTemperature() {
        System.out.println("Checking refrigerator temperature.");
    }

    @Override
    public void display() {
        Refrigerator.super.display();
    }
}
