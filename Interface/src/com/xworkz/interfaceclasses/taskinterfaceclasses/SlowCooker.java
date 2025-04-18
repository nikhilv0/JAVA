package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SlowCooker {
    public void cookSlow();
    public void setTimer();
    public void turnOff();
    default void display(){
        System.out.println("Running default method");
    }
}
