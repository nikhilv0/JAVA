package com.xworkz.interfaceclasses.task2interfaceclasses;


import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class CameraDroneCombo implements Camera, DroneCamera {

    @Override
    public void takePhoto() {
        System.out.println("Drone camera taking photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Drone camera recording video...");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting drone camera settings...");
    }

    @Override
    public void fly() {
        System.out.println("Drone flying...");
    }

    @Override
    public void returnHome() {
        System.out.println("Drone returning home...");
    }
}

