package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface AutomaticSoapDispenser {
    public void dispenseSoap();
    public void refillSoap();
    public void cleanNozzle();
    default void display(){
        System.out.println("Running default method");
    }
}
