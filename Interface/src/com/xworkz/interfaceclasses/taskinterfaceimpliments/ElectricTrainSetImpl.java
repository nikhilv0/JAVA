package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ElectricTrainSet;

public class ElectricTrainSetImpl implements ElectricTrainSet {
    @Override
    public void startTrain() {
        System.out.println("Electric train started.");
    }

    @Override
    public void stopTrain() {
        System.out.println("Electric train stopped.");
    }

    @Override
    public void switchTrack() {
        System.out.println("Switching train track.");
    }
}
