package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface BarcodeScanner {
    public void scanCode();
    public void transmitData();
    public void resetScanner();
    default void display(){
        System.out.println("Running default method");
    }
}
