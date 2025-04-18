package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartCurtains {
    public void openCurtains();
    public void closeCurtains();
    public void setSchedule();
    default void display(){
        System.out.println("Running default method");
    }
}
