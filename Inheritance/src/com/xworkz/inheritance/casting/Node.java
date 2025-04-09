package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.external.Component;
import com.xworkz.inheritance.external.Frame;

public class Node extends Component {
    public void node(Frame frame){
        frame.click();
        frame.enable();
        frame.disable();
        frame.render();
        frame.resize();

        if(frame instanceof Component){
            Component component=(Component) frame;
            System.out.println("running DrawingBoard casting class");
            frame.frame();
        }

    }
}

