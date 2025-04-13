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
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Isla){
                Isla isla=this;
                Isla isla2=(Isla) obj;
                if (isla.favoriteColor.equals(isla2.favoriteColor) && isla.age==(isla2.age)){
                    return true;
                }
            }
        }
        return false;
    }
}
