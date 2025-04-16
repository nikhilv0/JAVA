package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Speaker;

public class SpeakerImpl implements Speaker {
    @Override
    public void playSound() {
        System.out.println("Playing sound.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing volume.");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decreasing volume.");
    }
}
