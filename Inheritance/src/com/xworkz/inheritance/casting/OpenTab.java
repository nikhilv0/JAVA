package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.external.Component;
import com.xworkz.inheritance.external.Tab;

public class OpenTab extends Component {
    public void open(Tab tab){
        tab.click();
        tab.enable();
        tab.disable();
        tab.render();
        tab.resize();

        if(tab instanceof Component){
            Component component=(Component) tab;
            System.out.println("running OpenTab casting class");
            tab.tap();
        }

    }
}
