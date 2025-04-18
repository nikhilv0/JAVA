package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmokeDetector;

public class SmokeDetectorImpl implements SmokeDetector {
    @Override
    public void detectSmoke() {
        System.out.println("Smoke has been detected!");
    }

    @Override
    public void soundAlarm() {
        System.out.println("Smoke alarm is sounding.");
    }

    @Override
    public void testSystem() {
        System.out.println("Smoke detector self-test complete.");
    }

    @Override
    public void display() {
        SmokeDetector.super.display();
    }
}
