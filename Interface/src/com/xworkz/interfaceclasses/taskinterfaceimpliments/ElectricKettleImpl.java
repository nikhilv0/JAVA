package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ElectricKettle;

public class ElectricKettleImpl implements ElectricKettle {
    @Override
    public void boilWater() {
        System.out.println("Electric kettle is boiling water.");
    }

    @Override
    public void turnOffAutomatically() {
        System.out.println("Electric kettle turned off automatically after boiling.");
    }

    @Override
    public void keepWarm() {
        System.out.println("Electric kettle is keeping water warm.");
    }

    @Override
    public void display() {
        ElectricKettle.super.display();
    }
}
