package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Microwave {
    public void startHeating();
    public void stopHeating();
    public void setTimer();
    default void display(){
        System.out.println("Running default method");
    }
}
