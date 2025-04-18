package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface CoffeeMaker {
    public void brewCoffee();
    public void cleanMachine();
    public void turnOff();
    default void display(){
        System.out.println("Running default method");
    }
}
