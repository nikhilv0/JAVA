package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.EBookReader;

public class EBookReaderImpl implements EBookReader {
    @Override
    public void openBook() {
        System.out.println("Opening eBook.");
    }

    @Override
    public void turnPage() {
        System.out.println("Turning page.");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting brightness.");
    }

    @Override
    public void display() {
        EBookReader.super.display();
    }
}
