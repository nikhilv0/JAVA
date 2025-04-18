package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Printer {
    public void printDocument();
    public void scanDocument();
    public void cancelJob();
    default void display(){
        System.out.println("Running default method");
    }
}
