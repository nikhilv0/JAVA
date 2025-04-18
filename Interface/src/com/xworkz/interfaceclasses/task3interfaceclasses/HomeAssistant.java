package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class HomeAssistant implements SmartPhone, CoffeeMaker, WaterHeater, SmartWatch, Tablet {
    @Override
    public void makeCall() {
        System.out.println("Making a call with HomeAssistant...");
    }

    @Override
    public void sendText() {
        System.out.println("Sending a text from HomeAssistant...");
    }

    @Override
    public void openApp() {
        System.out.println("Opening app on HomeAssistant...");
    }

    @Override
    public void display() {
        SmartPhone.super.display();
    }

    @Override
    public void brewCoffee() {
        System.out.println("Brewing coffee with HomeAssistant...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("Cleaning coffee module in HomeAssistant...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off coffee module in HomeAssistant...");
    }

    @Override
    public void heatWater() {
        System.out.println("Heating water with HomeAssistant...");
    }

    @Override
    public void turnOffHeater() {
        System.out.println("Turning off water heater in HomeAssistant...");
    }

    @Override
    public void setTemperature() {
        System.out.println("Setting water temperature in HomeAssistant...");
    }

    @Override
    public void showTime() {
        System.out.println("Showing time on HomeAssistant...");
    }

    @Override
    public void trackSteps() {
        System.out.println("Tracking steps with HomeAssistant...");
    }

    @Override
    public void displayNotification() {
        System.out.println("Displaying notification on HomeAssistant...");
    }

    @Override
    public void draw() {
        System.out.println("Drawing on HomeAssistant...");
    }

    @Override
    public void browseWeb() {
        System.out.println("Browsing the web with HomeAssistant...");
    }

    @Override
    public void watchVideo() {
        System.out.println("Watching video on HomeAssistant...");
    }
}
