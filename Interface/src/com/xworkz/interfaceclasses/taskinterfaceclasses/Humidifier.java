package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Humidifier {
    public void releaseMist();
    public void setHumidityLevel();
    public void turnOff();
    default void display(){
        System.out.println("Running default method");
    }
}
