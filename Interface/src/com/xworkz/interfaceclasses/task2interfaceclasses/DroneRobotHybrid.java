package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.DroneCamera;
import com.xworkz.interfaceclasses.taskinterfaceclasses.ToyRobot;

public class DroneRobotHybrid implements DroneCamera, ToyRobot {

    @Override
    public void fly() {
        System.out.println("Hybrid drone flying...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Hybrid drone recording...");
    }

    @Override
    public void returnHome() {
        System.out.println("Hybrid drone returning home...");
    }

    @Override
    public void walk() {
        System.out.println("Hybrid robot walking...");
    }

    @Override
    public void talk() {
        System.out.println("Hybrid robot talking...");
    }

    @Override
    public void dance() {
        System.out.println("Hybrid robot dancing...");
    }
}
