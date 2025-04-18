package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartMirror {
    public void displayTime();
    public void showWeather();
    public void adjustBrightness();
    default void display(){
        System.out.println("Running default method");
    }
}
