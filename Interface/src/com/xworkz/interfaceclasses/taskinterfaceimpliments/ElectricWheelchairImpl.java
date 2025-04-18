package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ElectricWheelchair;

public class ElectricWheelchairImpl implements ElectricWheelchair {
    @Override
    public void moveForward() {
        System.out.println("Electric wheelchair moving forward.");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric wheelchair turning left.");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Adjusting wheelchair speed.");
    }

    @Override
    public void display() {
        ElectricWheelchair.super.display();
    }
}
