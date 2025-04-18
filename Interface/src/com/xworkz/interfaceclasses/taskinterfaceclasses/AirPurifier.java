package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface AirPurifier {
    public void purifyAir();
    public void changeFilter();
    public void adjustFanSpeed();
    default void display(){
        System.out.println("Running default method");
    }
}
