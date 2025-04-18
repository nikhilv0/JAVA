package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface PowerInverter {
    public void convertPower();
    public void switchMode();
    public void displayStatus();
    default void display(){
        System.out.println("Running default method");
    }
}
