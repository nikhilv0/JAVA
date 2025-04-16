package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class AllPurposeAssistant implements SmartPhone, Laptop, CoffeeMaker, VacuumCleaner, SmartWatch {
    @Override
    public void makeCall() {
        System.out.println("AllPurposeAssistant making a call...");
    }

    @Override
    public void sendText() {
        System.out.println("AllPurposeAssistant sending a text...");
    }

    @Override
    public void openApp() {
        System.out.println("AllPurposeAssistant opening an app...");
    }

    @Override
    public void compileCode() {
        System.out.println("AllPurposeAssistant compiling code...");
    }

    @Override
    public void runApplication() {
        System.out.println("AllPurposeAssistant running application...");
    }

    @Override
    public void shutDown() {
        System.out.println("AllPurposeAssistant shutting down...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("AllPurposeAssistant brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("AllPurposeAssistant cleaning coffee machine...");
    }

    @Override
    public void turnOff() {
        System.out.println("AllPurposeAssistant turning off...");
    }

    @Override
    public void startCleaning() {
        System.out.println("AllPurposeAssistant starting vacuum cleaner...");
    }

    @Override
    public void stopCleaning() {
        System.out.println("AllPurposeAssistant stopping vacuum cleaner...");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("AllPurposeAssistant emptying dust bag...");
    }

    @Override
    public void showTime() {
        System.out.println("AllPurposeAssistant showing time...");
    }

    @Override
    public void trackSteps() {
        System.out.println("AllPurposeAssistant tracking steps...");
    }

    @Override
    public void displayNotification() {
        System.out.println("AllPurposeAssistant displaying notifications...");
    }
}
