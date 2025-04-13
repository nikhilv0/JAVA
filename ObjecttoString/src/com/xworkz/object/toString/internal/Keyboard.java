package com.xworkz.object.toString.internal;

public class Keyboard {
    private String brand, layout;
    private boolean isMechanical;
    public Keyboard(String brand, String layout, boolean isMechanical) {
        this.brand = brand;
        this.layout = layout;
        this.isMechanical = isMechanical;
    }
    @Override
    public String toString() {
        return "Keyboard {Brand:" + this.brand + " Layout:" + this.layout + " Mechanical:" + this.isMechanical + "}";
    }
    @Override
    public int hashCode() {
        return 50;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Keyboard){
                Keyboard keyboard=this;
                Keyboard keyboard2=(Keyboard) obj;
                if (keyboard.brand.equals(keyboard2.brand) && keyboard.layout.equals(keyboard2.layout)){
                    return true;
                }
            }
        }
        return false;
    }
}
