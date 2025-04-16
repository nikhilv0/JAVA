package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Camera;

public class CameraImpl implements Camera {
    @Override
    public void takePhoto() {
        System.out.println("Photo has been taken.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video.");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Camera settings have been adjusted.");
    }
}
