package com.xworkz.object.toString.internal;

public class Jasper {
    private String favoriteColor;
    private int age;
    private double height;

    public Jasper(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Jasper{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
}
