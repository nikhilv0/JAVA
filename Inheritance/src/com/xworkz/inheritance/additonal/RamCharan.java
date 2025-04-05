package com.xworkz.inheritance.additonal;

public class RamCharan extends Model {
    public RamCharan() {
        super();
        System.out.println("Running constructor of RamCharan class");
    }
    @Override
    public void walk() {
        System.out.println("Running walk in RamCharan class");
    }

    public void pose() {
        System.out.println("Posing in RamCharan class");
    }

    public void design() {
        System.out.println("design in RamCharan class");
    }

    public void dance() {
        System.out.println("dancing in RamCharan class");
    }

    public void display() {
        System.out.println("Displaying in RamCharan class");
    }
}
