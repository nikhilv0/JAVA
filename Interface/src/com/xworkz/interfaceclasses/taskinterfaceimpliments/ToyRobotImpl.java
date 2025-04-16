package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ToyRobot;

public class ToyRobotImpl implements ToyRobot {
    @Override
    public void walk() {
        System.out.println("Toy robot is walking.");
    }

    @Override
    public void talk() {
        System.out.println("Toy robot is talking.");
    }

    @Override
    public void dance() {
        System.out.println("Toy robot is dancing.");
    }
}
