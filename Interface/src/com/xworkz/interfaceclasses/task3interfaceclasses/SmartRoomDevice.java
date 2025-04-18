package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class SmartRoomDevice implements SmartPhone, VacuumCleaner, CeilingFan, WaterHeater, Printer {
    @Override
    public void makeCall() {
        System.out.println("SmartRoomDevice making a call...");
    }

    @Override
    public void sendText() {
        System.out.println("SmartRoomDevice sending a text...");
    }

    @Override
    public void openApp() {
        System.out.println("SmartRoomDevice opening an app...");
    }

    @Override
    public void display() {
        SmartPhone.super.display();
    }

    @Override
    public void startCleaning() {
        System.out.println("SmartRoomDevice starting cleaning...");
    }

    @Override
    public void stopCleaning() {
        System.out.println("SmartRoomDevice stopping cleaning...");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("SmartRoomDevice emptying dust bag...");
    }

    @Override
    public void turnOnFan() {
        System.out.println("SmartRoomDevice turning on fan...");
    }

    @Override
    public void turnOffFan() {
        System.out.println("SmartRoomDevice turning off fan...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("SmartRoomDevice adjusting fan speed...");
    }

    @Override
    public void heatWater() {
        System.out.println("SmartRoomDevice heating water...");
    }

    @Override
    public void turnOffHeater() {
        System.out.println("SmartRoomDevice turning off heater...");
    }

    @Override
    public void setTemperature() {
        System.out.println("SmartRoomDevice setting water temperature...");
    }

    @Override
    public void printDocument() {
        System.out.println("SmartRoomDevice printing document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("SmartRoomDevice scanning document...");
    }

    @Override
    public void cancelJob() {
        System.out.println("SmartRoomDevice cancelling print job...");
    }
}
