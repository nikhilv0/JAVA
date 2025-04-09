package com.xworkz.object.toString.internal;

public class Silas {
    private String favoriteColor;
    private int age;
    private double height;

    public Silas(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Silas{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
}
