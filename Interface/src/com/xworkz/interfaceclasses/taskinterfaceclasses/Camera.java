package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Camera {
    public void takePhoto();
    public void recordVideo();
    public void adjustSettings();
    default void display(){
        System.out.println("Running default method");
    }
}
