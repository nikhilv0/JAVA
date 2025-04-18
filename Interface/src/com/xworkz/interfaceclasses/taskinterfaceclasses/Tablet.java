package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Tablet {
    public void draw();
    public void browseWeb();
    public void watchVideo();
    default void display(){
        System.out.println("Running default method");
    }
}
