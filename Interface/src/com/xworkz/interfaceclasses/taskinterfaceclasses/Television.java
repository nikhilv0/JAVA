package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Television {
    public void powerOn();
    public void powerOff();
    public void changeChannel();
    default void display(){
        System.out.println("Running default method");
    }
}
