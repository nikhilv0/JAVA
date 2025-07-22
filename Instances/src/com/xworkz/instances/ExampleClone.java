package com.xworkz.instances;

public class ExampleClone {
    public static void main(String[] args) {

        Classes original = new Classes("Hello", 100);
        Classes clone=original.clone();

        System.out.println(original);
        System.out.println(clone);
    }
}
