package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Refrigerator {
    public void coolItems();
    public void defrost();
    public void checkTemperature();
    default void display(){
        System.out.println("Running default method");
    }
}
