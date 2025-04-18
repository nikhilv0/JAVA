package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface ElectricToothbrush {
    public void startBrushing();
    public void stopBrushing();
    public void changeMode();
    default void display(){
        System.out.println("Running default method");
    }
}
