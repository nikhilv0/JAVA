package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ElectricTrainSet;
import com.xworkz.interfaceclasses.taskinterfaceclasses.ToyRobot;

public class RobotTrainController implements ToyRobot, ElectricTrainSet {

    @Override
    public void walk() {
        System.out.println("Robot walking...");
    }

    @Override
    public void talk() {
        System.out.println("Robot talking...");
    }

    @Override
    public void dance() {
        System.out.println("Robot dancing...");
    }

    @Override
    public void startTrain() {
        System.out.println("Train started...");
    }

    @Override
    public void stopTrain() {
        System.out.println("Train stopped...");
    }

    @Override
    public void switchTrack() {
        System.out.println("Train track switched...");
    }

    @Override
    public void display() {
        ToyRobot.super.display();
    }
}
