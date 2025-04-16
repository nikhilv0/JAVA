package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.DroneCamera;
import com.xworkz.interfaceclasses.taskinterfaceclasses.ToyRobot;

public class SmartToyRobotDrone implements ToyRobot, DroneCamera {

    @Override
    public void walk() {
        System.out.println("Toy robot is walking...");
    }

    @Override
    public void talk() {
        System.out.println("Toy robot is talking...");
    }

    @Override
    public void dance() {
        System.out.println("Toy robot is dancing...");
    }

    @Override
    public void fly() {
        System.out.println("Drone is flying...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Drone is recording video...");
    }

    @Override
    public void returnHome() {
        System.out.println("Drone is returning home...");
    }
}
