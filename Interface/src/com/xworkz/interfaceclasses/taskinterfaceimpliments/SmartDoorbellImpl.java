package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartDoorbell;

public class SmartDoorbellImpl implements SmartDoorbell {
    @Override
    public void ringBell() {
        System.out.println("Ring bell.");
    }

    @Override
    public void streamVideo() {
        System.out.println("Streaming video.");
    }

    @Override
    public void talkToVisitor() {
        System.out.println("Talking to visitor.");
    }

    @Override
    public void display() {
        SmartDoorbell.super.display();
    }
}
