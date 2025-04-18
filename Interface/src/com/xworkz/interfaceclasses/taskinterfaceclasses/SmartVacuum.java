package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartVacuum {
    public void startCleaning();
    public void returnToDock();
    public void emptyDustBin();
    default void display(){
        System.out.println("Running default method");
    }
}
