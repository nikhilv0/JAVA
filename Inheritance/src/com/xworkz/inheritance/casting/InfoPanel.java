package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.external.Component;
import com.xworkz.inheritance.external.Panel;

public class InfoPanel extends Component {
    public void info(Panel panel){
        panel.click();
        panel.enable();
        panel.disable();
        panel.render();
        panel.resize();

        if(panel instanceof Component){
            Component component=(Component) panel;
            System.out.println("running InfoPanel casting class");
            panel.open();
        }

    }

}

