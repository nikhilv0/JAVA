package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartCamera {
    public void recordVideo();
    public void detectMotion();
    public void sendAlert();
    default void display(){
        System.out.println("Running default method");
    }
}
