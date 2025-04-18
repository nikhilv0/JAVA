package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Train;

public class TrainImpl implements Train {
    @Override
    public void startEngine() {
        System.out.println("Train engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Train engine stopped.");
    }

    @Override
    public void resetSystem() {
        System.out.println("Train system reset.");
    }

    @Override
    public void display() {
        Train.super.display();
    }
}
