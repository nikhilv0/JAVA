package com.xworkz.object.toString.internal;

public class Ava {
    private String favoriteColor;
    private int age;
    private double height;

    public Ava(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Ava{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
}
