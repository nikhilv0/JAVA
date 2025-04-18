package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface AirConditioner {
    public void turnOn();
    public void turnOff();
    public void setTemperature();

    default void display(){
        System.out.println("Running default method");
    }
}
