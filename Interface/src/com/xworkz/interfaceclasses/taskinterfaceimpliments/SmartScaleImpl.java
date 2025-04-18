package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartScale;

public class SmartScaleImpl implements SmartScale {
    @Override
    public void measureWeight() {
        System.out.println("Measuring weight.");
    }

    @Override
    public void syncWithApp() {
        System.out.println("Syncing with app.");
    }

    @Override
    public void resetScale() {
        System.out.println("Resetting scale.");
    }

    @Override
    public void display() {
        SmartScale.super.display();
    }
}
