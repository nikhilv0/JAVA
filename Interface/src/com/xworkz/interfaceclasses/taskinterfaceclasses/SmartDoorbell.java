package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartDoorbell {
    public void ringBell();
    public void streamVideo();
    public void talkToVisitor();
    default void display(){
        System.out.println("Running default method");
    }
}
