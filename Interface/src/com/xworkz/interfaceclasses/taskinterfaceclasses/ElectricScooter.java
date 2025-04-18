package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface ElectricScooter {
    public void accelerate();
    public void applyBrake();
    public void chargeBattery();
    default void display(){
        System.out.println("Running default method");
    }
}
