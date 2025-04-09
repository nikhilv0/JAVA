package com.xworkz.object.toString.internal;

public class Aria {
    private String favoriteColor;
    private int age;
    private double height;

    public Aria(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Aria{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
}
