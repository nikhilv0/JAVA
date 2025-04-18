package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartWatch;

public class SmartWatchImpl implements SmartWatch {
    @Override
    public void showTime() {
        System.out.println("Displaying time on smartwatch.");
    }

    @Override
    public void trackSteps() {
        System.out.println("Tracking steps on smartwatch.");
    }

    @Override
    public void displayNotification() {
        System.out.println("Displaying notification on smartwatch.");
    }

    @Override
    public void display() {
        SmartWatch.super.display();
    }
}
