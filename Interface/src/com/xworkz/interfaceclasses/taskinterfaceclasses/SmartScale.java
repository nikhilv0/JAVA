package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartScale {
    public void measureWeight();
    public void syncWithApp();
    public void resetScale();
    default void display(){
        System.out.println("Running default method");
    }
}
