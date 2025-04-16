package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Camera;
import com.xworkz.interfaceclasses.taskinterfaceclasses.EBookReader;

public class SmartCameraEBookReader implements Camera, EBookReader {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with camera...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video with camera...");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting camera settings...");
    }

    @Override
    public void openBook() {
        System.out.println("Opening eBook...");
    }

    @Override
    public void turnPage() {
        System.out.println("Turning page in eBook...");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting eBook brightness...");
    }
}
