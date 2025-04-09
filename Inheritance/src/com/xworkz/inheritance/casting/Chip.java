package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.external.Component;
import com.xworkz.inheritance.external.Window;

public class Chip extends Component {
    public void chipit(Window window){
        window.click();
        window.enable();
        window.disable();
        window.render();
        window.resize();

        if(window instanceof Component){
            Component component=(Component) window;
            System.out.println("running DrawingBoard casting class");
            window.shutdown();
        }

    }
}

