package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Tram {
    public void startEngine();
    public void stopEngine();
    public void resetSystem();
    default void display(){
        System.out.println("Running default method");
    }
}
