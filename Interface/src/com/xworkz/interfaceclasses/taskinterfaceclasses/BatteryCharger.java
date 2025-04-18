package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface BatteryCharger {
    public void startCharging();
    public void stopCharging();
    public void checkBatteryStatus();
    default void display(){
        System.out.println("Running default method");
    }
}
