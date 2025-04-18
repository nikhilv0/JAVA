package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartSprinkler {
    public void startSprinkling();
    public void stopSprinkling();
    public void scheduleWatering();
    default void display(){
        System.out.println("Running default method");
    }
}
