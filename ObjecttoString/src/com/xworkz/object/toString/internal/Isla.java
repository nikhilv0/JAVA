package com.xworkz.object.toString.internal;

public class Isla {
    private String favoriteColor;
    private int age;
    private double height;

    public Isla(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Isla{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
    @Override
    public int hashCode() {
        return 54;
    }
}
