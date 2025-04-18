package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.AirConditioner;

public class AirConditionerImpl implements AirConditioner {
    @Override
    public void turnOn() {
        System.out.println("Air conditioner turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Air conditioner turned off");
    }

    @Override
    public void setTemperature() {
        System.out.println("Setting air conditioner temperatur");
    }

    @Override
    public void display() {
        AirConditioner.super.display();
    }
}
