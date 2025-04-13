package com.xworkz.object.toString.internal;

public class Scanner {
    private String brand, type;
    private int resolution;
    public Scanner(String brand, String type, int resolution) {
        this.brand = brand;
        this.type = type;
        this.resolution = resolution;
    }
    @Override
    public String toString() {
        return "Scanner {Brand:" + this.brand + " Type:" + this.type + " Resolution:" + this.resolution + "}";
    }
    @Override
    public int hashCode() {
        return 27;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Scanner){
                Scanner scanner=this;
                Scanner scanner2=(Scanner) obj;
                if (scanner.brand.equals(scanner2.brand) && scanner.type.equals(scanner2.type) && scanner.resolution==(scanner2.resolution)){
                    return true;
                }
            }
        }
        return false;
    }
}
