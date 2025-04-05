package com.xworkz.inheritance.additonal;

public class Nani extends Model {
    public Nani() {
        super();
        System.out.println("Running constructor of Nani class");
    }
    @Override
    public void walk() {
        System.out.println("Running walk in NaniNani class");
    }

    public void pose() {
        System.out.println("Posing in Nani class");
    }

    public void design() {
        System.out.println("design in Nani class");
    }

    public void dance() {
        System.out.println("dancing in Nani class");
    }

    public void display() {
        System.out.println("Displaying in Nani class");
    }
}
