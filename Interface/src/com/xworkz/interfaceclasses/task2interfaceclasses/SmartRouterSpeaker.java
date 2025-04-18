package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Router;
import com.xworkz.interfaceclasses.taskinterfaceclasses.Speaker;

public class SmartRouterSpeaker implements Router, Speaker {

    @Override
    public void connectToInternet() {
        System.out.println("Connecting to internet via router...");
    }

    @Override
    public void resetRouter() {
        System.out.println("Resetting the router...");
    }

    @Override
    public void updateFirmware() {
        System.out.println("Updating router firmware...");
    }

    @Override
    public void display() {
        Router.super.display();
    }

    @Override
    public void playSound() {
        System.out.println("Playing sound through the speaker...");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing speaker volume...");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decreasing speaker volume...");
    }
}
