package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.external.Component;
import com.xworkz.inheritance.external.NavigationBar;

public class Device extends Component {
    public void device(NavigationBar navigator){
        navigator.click();
        navigator.enable();
        navigator.disable();
        navigator.render();
        navigator.resize();

        if(navigator instanceof Component){
            Component component=(Component) navigator;
            System.out.println("running DrawingBoard casting class");
            navigator.nav();
        }

    }
}

