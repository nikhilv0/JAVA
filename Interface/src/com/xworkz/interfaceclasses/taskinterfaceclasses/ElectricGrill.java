package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface ElectricGrill {
    public void preheat();
    public void grillFood();
    public void turnOffGrill();
    default void display(){
        System.out.println("Running default method");
    }
}
