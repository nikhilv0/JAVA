package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface MotionSensor {
    public void detectMovement();
    public void sendSignal();
    public void calibrateSensor();
    default void display(){
        System.out.println("Running default method");
    }
}
