package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartPlug {
    public void turnOn();
    public void turnOff();
    public void monitorPowerUsage();
    default void display(){
        System.out.println("Running default method");
    }
}
