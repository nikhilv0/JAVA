package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface ElectricTrainSet {
    public void startTrain();
    public void stopTrain();
    public void switchTrack();
    default void display(){
        System.out.println("Running default method");
    }
}
