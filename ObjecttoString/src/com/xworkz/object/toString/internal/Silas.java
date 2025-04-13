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
    @Override
    public int hashCode() {
        return 24;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Silas){
                Silas silas=this;
                Silas silas2=(Silas) obj;
                if (silas.favoriteColor.equals(silas2.favoriteColor) && silas.age==(silas2.age) && silas.height==(silas2.height)){
                    return true;
                }
            }
        }
        return false;
    }
}
