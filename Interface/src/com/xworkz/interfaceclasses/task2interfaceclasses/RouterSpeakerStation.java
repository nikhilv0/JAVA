package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Router;
import com.xworkz.interfaceclasses.taskinterfaceclasses.Speaker;

public class RouterSpeakerStation implements Router, Speaker {

    @Override
    public void connectToInternet() {
        System.out.println("Connecting to internet via speaker station...");
    }

    @Override
    public void resetRouter() {
        System.out.println("Resetting router...");
    }

    @Override
    public void updateFirmware() {
        System.out.println("Updating router firmware...");
    }

    @Override
    public void playSound() {
        System.out.println("Playing music through speaker station...");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing speaker station volume...");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decreasing speaker station volume...");
    }

    @Override
    public void display() {
        Router.super.display();
    }
}
