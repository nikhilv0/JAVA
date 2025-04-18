package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface DigitalThermometer {
    public void measureTemperature();
    public void displayReading();
    public void resetDevice();
    default void display(){
        System.out.println("Running default method");
    }
}
