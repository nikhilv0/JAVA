package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartLight;
import com.xworkz.interfaceclasses.taskinterfaceclasses.Speaker;

public class LightSpeakerCombo implements SmartLight, Speaker {

    @Override
    public void turnOnLight() {
        System.out.println("Turning on smart light...");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Turning off smart light...");
    }

    @Override
    public void changeColor() {
        System.out.println("Changing smart light color...");
    }

    @Override
    public void playSound() {
        System.out.println("Smart speaker playing music...");
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
