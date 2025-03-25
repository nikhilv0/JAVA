package com.xwork.AcessModifier;

import com.xworkz.AccessSpecifer.Design;
import com.xworkz.AccessSpecifer.Frame;

public class FrameMaking {
    void Marketing(){
        Frame frame=new Frame();
        frame.DiffType();
        System.out.println("type:"+frame.type);
        Design design=new Design(frame);
        design.designDis();
    }
}
