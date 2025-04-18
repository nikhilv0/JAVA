package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface CeilingFan {
    public void turnOnFan();
    public void turnOffFan();
    public void adjustSpeed();
    default void display(){
        System.out.println("Running default method");
    }
}
