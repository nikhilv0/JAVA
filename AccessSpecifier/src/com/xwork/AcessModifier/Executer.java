package com.xwork.AcessModifier;

import com.xworkz.AccessSpecifer.Collab;
import com.xworkz.AccessSpecifer.Pant;

public class Executer {
    void exicuterdis(){
        Pant pant=new Pant();
        pant.displayBrand();
        System.out.println("brand:"+pant.brand);
        Collab collab=new Collab(pant);
        collab.displaycollob();
    }
}

