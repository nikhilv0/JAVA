package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmokeDetector {
    public void detectSmoke();
    public void soundAlarm();
    public void testSystem();
    default void display(){
        System.out.println("Running default method");
    }
}
