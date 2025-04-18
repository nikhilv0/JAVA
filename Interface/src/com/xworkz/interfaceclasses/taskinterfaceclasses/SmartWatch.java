package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartWatch {
    public void showTime();
    public void trackSteps();
    public void displayNotification();
    default void display(){
        System.out.println("Running default method");
    }
}
