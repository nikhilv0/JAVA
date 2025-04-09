package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.internal.Data;
import com.xworkz.inheritance.internal.Resource;

public class TextBook extends Resource {
    public void book(Data data){
        data.release();
        data.getInfo();
        data.save();
        data.refresh();
        data.load();

        if (data instanceof Resource){
            Resource resource=(Resource) data;
            System.out.println("running Noise casting class");
            data.use();
        }
    }
}
