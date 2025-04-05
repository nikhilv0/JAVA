package com.xworkz.inheritance.additonal;

public class Nithiin extends Model {
    public Nithiin() {
        super();
        System.out.println("Running constructor of Nithiin class");
    }
    @Override
    public void walk() {
        System.out.println("Running walk in Nithiin class");
    }

    public void pose() {
        System.out.println("Posing in Nithiin class");
    }

    public void design() {
        System.out.println("design in Nithiin class");
    }

    public void dance() {
        System.out.println("dancing in Nithiin class");
    }

    public void display() {
        System.out.println("Displaying in Nithiin class");
    }
}
