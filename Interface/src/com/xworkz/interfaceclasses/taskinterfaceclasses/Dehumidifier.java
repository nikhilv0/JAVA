package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Dehumidifier {
    public void removeMoisture();
    public void setDryLevel();
    public void emptyTank();
    default void display(){
        System.out.println("Running default method");
    }
}
