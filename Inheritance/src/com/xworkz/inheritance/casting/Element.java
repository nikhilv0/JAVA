package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.internal.File;
import com.xworkz.inheritance.internal.Resource;

public class Element extends Resource {
    public void element(File file){
        file.release();
        file.getInfo();
        file.save();
        file.refresh();
        file.load();

        if (file instanceof Resource){
            Resource resource=(Resource) file;
            System.out.println("running Noise casting class");
            file.update();
        }
    }
}
