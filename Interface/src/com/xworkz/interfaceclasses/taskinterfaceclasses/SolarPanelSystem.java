package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SolarPanelSystem {
    public void generatePower();
    public void storeEnergy();
    public void trackSunlight();
    default void display(){
        System.out.println("Running default method");
    }
}
