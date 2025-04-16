package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Tablet;

public class TabletImpl implements Tablet {
    @Override
    public void draw() {
        System.out.println("Drawing on tablet.");
    }

    @Override
    public void browseWeb() {
        System.out.println("Browsing the web on tablet.");
    }

    @Override
    public void watchVideo() {
        System.out.println("Watching video on tablet.");
    }
}
