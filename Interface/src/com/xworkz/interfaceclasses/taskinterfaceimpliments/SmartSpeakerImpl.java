package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartSpeaker;

public class SmartSpeakerImpl implements SmartSpeaker {
    @Override
    public void playMusic() {
        System.out.println("Playing music.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing volume.");
    }

    @Override
    public void askAssistant() {
        System.out.println("Asking assistant.");
    }

    @Override
    public void display() {
        SmartSpeaker.super.display();
    }
}
