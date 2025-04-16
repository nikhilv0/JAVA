package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ArcadeMachine;
import com.xworkz.interfaceclasses.taskinterfaceclasses.DroneCamera;

public class SmartArcadeDrone implements ArcadeMachine, DroneCamera {

    @Override
    public void insertCoin() {
        System.out.println("Inserting coin into arcade...");
    }

    @Override
    public void startGame() {
        System.out.println("Starting arcade game...");
    }

    @Override
    public void endGame() {
        System.out.println("Ending arcade game...");
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
