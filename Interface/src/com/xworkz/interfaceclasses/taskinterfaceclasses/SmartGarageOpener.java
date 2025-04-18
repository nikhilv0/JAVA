package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartGarageOpener {
    public void openGarage();
    public void closeGarage();
    public void checkGarageStatus();
    default void display(){
        System.out.println("Running default method");
    }
}
