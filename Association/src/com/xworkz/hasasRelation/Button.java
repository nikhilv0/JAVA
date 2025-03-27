package com.xworkz.hasasRelation;

public class Button {
        private Material material;

    public Button(Material material){
        this.material=material;
    }
    public void buttonDisplay(){
        this.material.materialDisplay();
    }
}
