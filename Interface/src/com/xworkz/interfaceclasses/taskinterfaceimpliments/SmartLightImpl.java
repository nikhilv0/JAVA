package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartLight;

public class SmartLightImpl implements SmartLight {
    @Override
    public void turnOnLight() {
        System.out.println("Smart light turned on.");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Smart light turned off.");
    }

    @Override
    public void changeColor() {
        System.out.println("Changing light color.");
    }

    @Override
    public void display() {
        SmartLight.super.display();
    }
}
