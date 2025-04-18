package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface WashingMachine {
    public void startCycle();
    public void stopCycle();
    public void drainWater();
    default void display(){
        System.out.println("Running default method");
    }
}
