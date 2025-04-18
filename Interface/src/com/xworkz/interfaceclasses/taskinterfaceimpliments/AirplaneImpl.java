package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Airplane;

public class AirplaneImpl implements Airplane {
    @Override
    public void startEngine() {
        System.out.println("Airplane engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Airplane engine stopped");
    }

    @Override
    public void resetSystem() {
        System.out.println("Airplane system reset");
    }

    @Override
    public void display() {
        Airplane.super.display();
    }
}
