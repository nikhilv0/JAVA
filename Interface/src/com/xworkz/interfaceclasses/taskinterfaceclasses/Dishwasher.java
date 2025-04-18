package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Dishwasher {
    public void startWashing();
    public void stopWashing();
    public void dryDishes();
    default void display(){
        System.out.println("Running default method");
    }
}
