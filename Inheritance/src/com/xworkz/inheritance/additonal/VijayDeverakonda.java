package com.xworkz.inheritance.additonal;

public class VijayDeverakonda extends Model {
    public VijayDeverakonda() {
        super();
        System.out.println("Running constructor of VijayDeverakonda class");
    }
    @Override
    public void walk() {
        System.out.println("Running walk in VijayDeverakonda class");
    }

    public void pose() {
        System.out.println("Posing in VijayDeverakonda class");
    }

    public void design() {
        System.out.println("design in VijayDeverakonda class");
    }

    public void dance() {
        System.out.println("dancing in VijayDeverakonda class");
    }

    public void display() {
        System.out.println("Displaying in VijayDeverakonda class");
    }
}
