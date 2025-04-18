package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.EBookReader;
import com.xworkz.interfaceclasses.taskinterfaceclasses.Router;

public class RouterEBookHub implements Router, EBookReader {

    @Override
    public void connectToInternet() {
        System.out.println("EBook hub connecting to internet...");
    }

    @Override
    public void resetRouter() {
        System.out.println("EBook hub resetting connection...");
    }

    @Override
    public void updateFirmware() {
        System.out.println("EBook hub updating firmware...");
    }

    @Override
    public void openBook() {
        System.out.println("Opening eBook on hub...");
    }

    @Override
    public void turnPage() {
        System.out.println("Turning page...");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting screen brightness...");
    }

    @Override
    public void display() {
        Router.super.display();
    }
}
