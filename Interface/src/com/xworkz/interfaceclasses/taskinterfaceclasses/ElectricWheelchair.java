package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface ElectricWheelchair {
    public void moveForward();
    public void turnLeft();
    public void adjustSpeed();
    default void display(){
        System.out.println("Running default method");
    }
}
