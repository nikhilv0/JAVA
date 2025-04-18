package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface DroneCamera {
    public void fly();
    public void recordVideo();
    public void returnHome();
    default void display(){
        System.out.println("Running default method");
    }
}
