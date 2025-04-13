package com.xworkz.object.toString.internal;

public class Table {
    private String shape, material;
    private double length;
    public Table(String shape, String material, double length) {
        this.shape = shape;
        this.material = material;
        this.length = length;
    }
    @Override
    public String toString() {
        return "Table {Shape: " + this.shape + ", Material: " + this.material + ", Length: " + this.length + " inches}";
    }

    @Override
    public int hashCode() {
        return 12;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Table){
                Table table=this;
                Table table2=(Table) obj;
                if (table.shape.equals(table2.shape) && table.material.equals(table2.material) && table.length==(table2.length)){
                    return true;
                }
            }
        }
        return false;
    }
}
