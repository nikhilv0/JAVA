package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface InductionCooktop {
    public void turnOnCooktop();
    public void setHeatLevel();
    public void turnOffCooktop();
    default void display(){
        System.out.println("Running default method");
    }
}
