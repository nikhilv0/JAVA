package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface CarbonMonoxideAlarm {
    public void detectGas();
    public void alert();
    public void resetAlarm();
    default void display(){
        System.out.println("Running default method");
    }
}
