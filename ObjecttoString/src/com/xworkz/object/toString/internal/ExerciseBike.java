package com.xworkz.object.toString.internal;

public class ExerciseBike {
    private String brand, type;
    public int resistanceLevels;
    public ExerciseBike(String brand, String type, int resistanceLevels) {
        this.brand = brand;
        this.type = type;
        this.resistanceLevels = resistanceLevels;
    }
    @Override
    public String toString() {
        return "ExerciseBike {Brand:" + this.brand + " Type:" + this.type + " ResistanceLevels:" + this.resistanceLevels + "}";
    }
    @Override
    public int hashCode() {
        return 68;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof ExerciseBike){
                ExerciseBike bike=this;
                ExerciseBike bike2=(ExerciseBike) obj;
                if (bike.brand.equals(bike2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
