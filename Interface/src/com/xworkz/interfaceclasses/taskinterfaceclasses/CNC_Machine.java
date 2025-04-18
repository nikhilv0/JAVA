package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface CNC_Machine {
    public void startMachine();
    public void stopMachine();
    public void calibrate();
    default void display(){
        System.out.println("Running default method");
    }
}
