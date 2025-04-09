package com.xworkz.object.toString.internal;

public class Maya {
    private String favoriteColor;
    private int age;
    private double height;

    public Maya(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Maya{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
}
