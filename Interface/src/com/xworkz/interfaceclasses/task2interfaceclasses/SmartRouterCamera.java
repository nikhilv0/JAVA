package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class SmartRouterCamera implements Router, Camera {

    @Override
    public void connectToInternet() {
        System.out.println("Connecting to the internet...");
    }

    @Override
    public void resetRouter() {
        System.out.println("Router is resetting...");
    }

    @Override
    public void updateFirmware() {
        System.out.println("Updating router firmware...");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting camera settings...");
    }
}


