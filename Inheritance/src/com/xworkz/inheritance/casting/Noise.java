package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.internal.Audio;
import com.xworkz.inheritance.internal.Resource;

public class Noise extends Resource{
    public void speak(Audio audio){
        audio.release();
        audio.getInfo();
        audio.save();
        audio.refresh();
        audio.load();

        if (audio instanceof Resource){
           Resource resource=(Resource) audio;
            System.out.println("running Noise casting class");
            audio.listen();
        }
    }

}
