package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.EBookReader;
import com.xworkz.interfaceclasses.taskinterfaceclasses.Speaker;

public class SmartSpeakerEBookReader implements Speaker, EBookReader {

    @Override
    public void playSound() {
        System.out.println("Playing sound...");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing volume...");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decreasing volume...");
    }

    @Override
    public void display() {
        Speaker.super.display();
    }

    @Override
    public void openBook() {
        System.out.println("Opening eBook...");
    }

    @Override
    public void turnPage() {
        System.out.println("Turning the page...");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting eBook brightness...");
    }
}
