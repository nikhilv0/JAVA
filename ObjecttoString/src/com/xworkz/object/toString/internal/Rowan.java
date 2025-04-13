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
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Rowan){
                Rowan rowan=this;
                Rowan rowan2=(Rowan) obj;
                if (rowan.favoriteColor.equals(rowan2.favoriteColor) && rowan.age==(rowan2.age) && rowan.height==(rowan2.height)){
                    return true;
                }
            }
        }
        return false;
    }
}
