package com.xworkz.object.toString.internal;

public class Rowan {
    private String favoriteColor;
    private int age;
    private double height;

    public Rowan(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rowan{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
    @Override
    public int hashCode() {
        return 29;
    }

}
