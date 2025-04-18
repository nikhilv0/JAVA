package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartThermostat {
    public void setTemperature();
    public void turnOnHeating();
    public void turnOffCooling();
    default void display(){
        System.out.println("Running default method");
    }
}
