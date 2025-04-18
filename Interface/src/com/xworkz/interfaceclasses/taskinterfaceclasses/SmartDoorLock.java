package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartDoorLock {
    public void lockDoor();
    public void unlockDoor();
    public void checkStatus();
    default void display(){
        System.out.println("Running default method");
    }
}
