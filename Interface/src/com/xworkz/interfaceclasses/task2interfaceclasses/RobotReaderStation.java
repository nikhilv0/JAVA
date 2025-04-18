package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.EBookReader;
import com.xworkz.interfaceclasses.taskinterfaceclasses.ToyRobot;

public class RobotReaderStation implements ToyRobot, EBookReader {

    @Override
    public void walk() {
        System.out.println("Robot walking to reading spot...");
    }

    @Override
    public void talk() {
        System.out.println("Robot narrating the book...");
    }

    @Override
    public void dance() {
        System.out.println("Robot dancing for story time...");
    }

    @Override
    public void openBook() {
        System.out.println("Opening eBook on robot screen...");
    }

    @Override
    public void turnPage() {
        System.out.println("Robot turning the digital page...");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Robot adjusting screen brightness...");
    }

    @Override
    public void display() {
        ToyRobot.super.display();
    }
}
