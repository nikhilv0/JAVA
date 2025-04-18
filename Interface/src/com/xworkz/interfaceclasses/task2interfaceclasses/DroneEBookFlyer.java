package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.DroneCamera;
import com.xworkz.interfaceclasses.taskinterfaceclasses.EBookReader;

public class DroneEBookFlyer implements DroneCamera, EBookReader {

    @Override
    public void fly() {
        System.out.println("Drone flying with eBook viewer...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Drone recording eBook view...");
    }

    @Override
    public void returnHome() {
        System.out.println("Drone returning home...");
    }

    @Override
    public void openBook() {
        System.out.println("Opening book in drone viewer...");
    }

    @Override
    public void turnPage() {
        System.out.println("Turning page in drone...");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting drone display brightness...");
    }

    @Override
    public void display() {
        DroneCamera.super.display();
    }
}
