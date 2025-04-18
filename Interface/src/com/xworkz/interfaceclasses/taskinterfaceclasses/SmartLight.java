package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartLight {
    public void turnOnLight();
    public void turnOffLight();
    public void changeColor();
    default void display(){
        System.out.println("Running default method");
    }
}
