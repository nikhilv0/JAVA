package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartMirror;

public class SmartMirrorImpl implements SmartMirror {
    @Override
    public void displayTime() {
        System.out.println("Displaying time.");
    }

    @Override
    public void showWeather() {
        System.out.println("Showing weather.");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting brightness.");
    }
}
