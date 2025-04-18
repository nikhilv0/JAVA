package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface DesktopComputer {
    public void powerOn();
    public void runDiagnostics();
    public void powerOff();
    default void display(){
        System.out.println("Running default method");
    }
}
