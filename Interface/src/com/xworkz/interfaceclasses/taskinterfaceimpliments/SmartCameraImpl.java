package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartCamera;

public class SmartCameraImpl implements SmartCamera {
    @Override
    public void recordVideo() {
        System.out.println("Recording video.");
    }

    @Override
    public void detectMotion() {
        System.out.println("Motion detected.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Sending alert.");
    }
}
