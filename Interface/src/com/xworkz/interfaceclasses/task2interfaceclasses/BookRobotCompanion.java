package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.EBookReader;
import com.xworkz.interfaceclasses.taskinterfaceclasses.ToyRobot;

public class BookRobotCompanion implements EBookReader, ToyRobot {

    @Override
    public void openBook() {
        System.out.println("Robot opens eBook...");
    }

    @Override
    public void turnPage() {
        System.out.println("Robot turns page...");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Robot adjusts screen brightness...");
    }

    @Override
    public void display() {
        EBookReader.super.display();
    }

    @Override
    public void walk() {
        System.out.println("Companion robot walking...");
    }

    @Override
    public void talk() {
        System.out.println("Companion robot talking...");
    }

    @Override
    public void dance() {
        System.out.println("Companion robot dancing...");
    }
}
