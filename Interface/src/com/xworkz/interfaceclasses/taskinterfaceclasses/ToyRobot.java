package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface ToyRobot {
    public void walk();
    public void talk();
    public void dance();
    default void display(){
        System.out.println("Running default method");
    }
}
