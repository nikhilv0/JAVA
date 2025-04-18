package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface FitnessTracker {
    public void countSteps();
    public void monitorHeartRate();
    public void syncData();
    default void display(){
        System.out.println("Running default method");
    }
}
