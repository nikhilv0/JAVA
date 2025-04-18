package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface ElectricKettle {
    public void boilWater();
    public void turnOffAutomatically();
    public void keepWarm();
    default void display(){
        System.out.println("Running default method");
    }
}
