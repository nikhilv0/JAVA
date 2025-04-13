package com.xworkz.object.toString.internal;

public class Nora {
    private String favoriteColor;
    private int age;
    private double height;

    public Nora(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Nora{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
    @Override
    public int hashCode() {
        return 38;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Nora){
                Nora nora=this;
                Nora nora2=(Nora) obj;
                if (nora.favoriteColor.equals(nora2.favoriteColor) && nora.age==(nora2.age) && nora.height==(nora2.height)){
                    return true;
                }
            }
        }
        return false;
    }
}
