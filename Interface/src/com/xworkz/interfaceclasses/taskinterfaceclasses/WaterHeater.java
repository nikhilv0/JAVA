package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface WaterHeater {
    public void heatWater();
    public void turnOffHeater();
    public void setTemperature();
    default void display(){
        System.out.println("Running default method");
    }
}
