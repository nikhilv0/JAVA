package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class ConnectedHub implements SmartPhone, Tablet, SmartWatch, Laptop, DesktopComputer {
    @Override
    public void makeCall() {
        System.out.println("ConnectedHub making a call...");
    }

    @Override
    public void sendText() {
        System.out.println("ConnectedHub sending a text...");
    }

    @Override
    public void openApp() {
        System.out.println("ConnectedHub opening an app...");
    }

    @Override
    public void display() {
        SmartPhone.super.display();
    }

    @Override
    public void draw() {
        System.out.println("ConnectedHub drawing...");
    }

    @Override
    public void browseWeb() {
        System.out.println("ConnectedHub browsing the web...");
    }

    @Override
    public void watchVideo() {
        System.out.println("ConnectedHub watching a video...");
    }

    @Override
    public void showTime() {
        System.out.println("ConnectedHub showing time...");
    }

    @Override
    public void trackSteps() {
        System.out.println("ConnectedHub tracking steps...");
    }

    @Override
    public void displayNotification() {
        System.out.println("ConnectedHub displaying notification...");
    }

    @Override
    public void compileCode() {
        System.out.println("ConnectedHub compiling code...");
    }

    @Override
    public void runApplication() {
        System.out.println("ConnectedHub running an application...");
    }

    @Override
    public void shutDown() {
        System.out.println("ConnectedHub shutting down...");
    }

    @Override
    public void powerOn() {
        System.out.println("ConnectedHub powering on...");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("ConnectedHub running diagnostics...");
    }

    @Override
    public void powerOff() {
        System.out.println("ConnectedHub powering off...");
    }
}
