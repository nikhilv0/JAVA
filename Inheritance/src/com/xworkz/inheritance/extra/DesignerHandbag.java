package com.xworkz.inheritance.extra;

public class DesignerHandbag extends Product {
    public DesignerHandbag() {
        super();
        System.out.println("Running constructor of DesignerHandbag class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying DesignerHandbag details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating DesignerHandbag discount");
    }

    public void checkAvailability() {
        System.out.println("Checking DesignerHandbag availability");
    }

    public void addToCart() {
        System.out.println("DesignerHandbag added to cart");
    }

    public void purchase() {
        System.out.println("DesignerHandbag purchased successfully");
    }
}
