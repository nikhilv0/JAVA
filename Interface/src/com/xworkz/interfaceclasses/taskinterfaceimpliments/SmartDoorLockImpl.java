package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartDoorLock;

public class SmartDoorLockImpl implements SmartDoorLock {
    @Override
    public void lockDoor() {
        System.out.println("Door is locked.");
    }

    @Override
    public void unlockDoor() {
        System.out.println("Door is unlocked.");
    }

    @Override
    public void checkStatus() {
        System.out.println("Checking door lock status.");
    }

    @Override
    public void display() {
        SmartDoorLock.super.display();
    }
}
