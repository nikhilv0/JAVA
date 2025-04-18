package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Router {
    public void connectToInternet();
    public void resetRouter();
    public void updateFirmware();
    default void display(){
        System.out.println("Running default method");
    }
}
