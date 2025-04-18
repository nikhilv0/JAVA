package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface RiceCooker {
    public void startCooking();
    public void keepWarm();
    public void stopCooking();
    default void display(){
        System.out.println("Running default method");
    }
}
