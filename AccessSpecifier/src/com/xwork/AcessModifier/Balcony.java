package com.xwork.AcessModifier;
import com.xworkz.AccessSpecifer.*;

public class Balcony {
    void balconyDis(){
        Window window=new Window();
        System.out.println("WindowSize:"+window.size);
        window.func();
        Curtain curtain=new Curtain(window);
        curtain.curtaindis();

    }
}
