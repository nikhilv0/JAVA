package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Laptop {
    public void compileCode();
    public void runApplication();
    public void shutDown();
    default void display(){
        System.out.println("Running default method");
    }
}
