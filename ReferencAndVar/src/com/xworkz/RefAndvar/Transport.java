package com.xworkz.RefAndvar;

public class Transport {
    String mode;
    int capacity;
    double fare;
    String operator;

    Transport(String mode, int capacity, double fare, String operator) {
        this.mode = mode;
        this.capacity = capacity;
        this.fare = fare;
        this.operator = operator;
    }

    void TransportMethod() {
        System.out.println("Transport:");
        System.out.println("Mode: " + mode);
        System.out.println("Capacity: " + capacity);
        System.out.println("Fare: " + fare);
        System.out.println("Operator: " + operator);
    }
}
