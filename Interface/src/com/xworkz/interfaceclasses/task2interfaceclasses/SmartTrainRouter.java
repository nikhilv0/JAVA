package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ElectricTrainSet;
import com.xworkz.interfaceclasses.taskinterfaceclasses.Router;

public class SmartTrainRouter implements ElectricTrainSet, Router {

    @Override
    public void startTrain() {
        System.out.println("Train started...");
    }

    @Override
    public void stopTrain() {
        System.out.println("Train stopped...");
    }

    @Override
    public void switchTrack() {
        System.out.println("Switching train track...");
    }

    @Override
    public void display() {
        ElectricTrainSet.super.display();
    }

    @Override
    public void connectToInternet() {
        System.out.println("Train connected to internet...");
    }

    @Override
    public void resetRouter() {
        System.out.println("Train router resetting...");
    }

    @Override
    public void updateFirmware() {
        System.out.println("Updating train router firmware...");
    }
}
