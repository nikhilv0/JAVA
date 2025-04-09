package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.internal.Image;
import com.xworkz.inheritance.internal.Resource;

public class Item extends Resource{
    public void item(Image image){
        image.release();
        image.getInfo();
        image.save();
        image.refresh();
        image.load();

        if (image instanceof Resource){
            Resource resource=(Resource) image;
            System.out.println("running Noise casting class");
            image.click();
        }
    }
}
