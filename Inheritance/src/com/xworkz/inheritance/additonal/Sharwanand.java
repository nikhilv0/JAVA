package com.xworkz.inheritance.additonal;

public class Sharwanand extends Model {
    public Sharwanand() {
        super();
        System.out.println("Running constructor of Sharwanand class");
    }
    @Override
    public void walk() {
        System.out.println("Running walk in Sharwanand class");
    }

    public void pose() {
        System.out.println("Posing in Sharwanand class");
    }

    public void design() {
        System.out.println("design in Sharwanand class");
    }

    public void dance() {
        System.out.println("dancing in Sharwanand class");
    }

    public void display() {
        System.out.println("Displaying in Sharwanand class");
    }
}
