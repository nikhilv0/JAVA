package com.xworkz.object.toString.internal;

public class Leo {
    private String favoriteColor;
    private int age;
    private double height;

    public Leo(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Leo{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
    @Override
    public int hashCode() {
        return 46;
    }
}
