package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.DroneCamera;

public class DroneCameraImpl implements DroneCamera {
    @Override
    public void fly() {
        System.out.println("Drone is flying.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Drone is recording video.");
    }

    @Override
    public void returnHome() {
        System.out.println("Drone is returning home.");
    }
}
