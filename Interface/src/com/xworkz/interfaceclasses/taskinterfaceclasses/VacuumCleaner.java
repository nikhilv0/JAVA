package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface VacuumCleaner {
    public void startCleaning();
    public void stopCleaning();
    public void emptyDustBag();
    default void display(){
        System.out.println("Running default method");
    }
}
