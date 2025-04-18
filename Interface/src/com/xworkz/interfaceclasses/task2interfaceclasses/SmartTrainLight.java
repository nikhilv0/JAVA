package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ElectricTrainSet;
import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartLight;

public class SmartTrainLight implements ElectricTrainSet, SmartLight {

    @Override
    public void startTrain() {
        System.out.println("Starting electric train...");
    }

    @Override
    public void stopTrain() {
        System.out.println("Stopping electric train...");
    }

    @Override
    public void switchTrack() {
        System.out.println("Switching track...");
    }

    @Override
    public void turnOnLight() {
        System.out.println("Turning on the light...");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Turning off the light...");
    }

    @Override
    public void changeColor() {
        System.out.println("Changing light color...");
    }

    @Override
    public void display() {
        ElectricTrainSet.super.display();
    }
}
