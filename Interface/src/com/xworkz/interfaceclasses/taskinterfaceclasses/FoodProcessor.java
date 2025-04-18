package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface FoodProcessor {
    public void chop();
    public void grind();
    public void slice();
    default void display(){
        System.out.println("Running default method");
    }
}
