package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ElectricToothbrush;

public class ElectricToothbrushImpl implements ElectricToothbrush {
    @Override
    public void startBrushing() {
        System.out.println("Toothbrush started vibrating.");
    }

    @Override
    public void stopBrushing() {
        System.out.println("Toothbrush turned off.");
    }

    @Override
    public void changeMode() {
        System.out.println("Toothbrush mode changed.");
    }

    @Override
    public void display() {
        ElectricToothbrush.super.display();
    }
}
