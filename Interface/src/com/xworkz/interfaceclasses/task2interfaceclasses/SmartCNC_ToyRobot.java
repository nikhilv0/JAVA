package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.CNC_Machine;
import com.xworkz.interfaceclasses.taskinterfaceclasses.ToyRobot;

public class SmartCNC_ToyRobot implements CNC_Machine, ToyRobot {

    @Override
    public void startMachine() {
        System.out.println("Starting CNC machine...");
    }

    @Override
    public void stopMachine() {
        System.out.println("Stopping CNC machine...");
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating CNC machine...");
    }

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
    public void display() {
        CNC_Machine.super.display();
    }
}
