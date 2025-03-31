package com.xworkz.enumObjects;

public enum Match {
    TICKETS("RCB"),PLACE("Banglore");

    private String name;
    private Match(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
