package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface WaterFilter {
    public void filterWater();
    public void replaceCartridge();
    public void resetIndicator();
    default void display(){
        System.out.println("Running default method");
    }
}
