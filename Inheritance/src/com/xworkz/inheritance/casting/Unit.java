package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.internal.Document;
import com.xworkz.inheritance.internal.Resource;

public class Unit {
    public void sevrice(Document document){
        document.release();
        document.getInfo();
        document.save();
        document.refresh();
        document.load();

        if (document instanceof Resource){
            Resource resource=(Resource) document;
            System.out.println("running Noise casting class");
            document.doc();
        }
    }
}
