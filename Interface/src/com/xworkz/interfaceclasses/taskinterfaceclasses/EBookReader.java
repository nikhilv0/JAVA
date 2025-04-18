package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface EBookReader {
    public void openBook();
    public void turnPage();
    public void adjustBrightness();
    default void display(){
        System.out.println("Running default method");
    }
}
