package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartPhone {
    public void makeCall();
    public void sendText();
    public void openApp();
    default void display(){
        System.out.println("Running default method");
    }
}
