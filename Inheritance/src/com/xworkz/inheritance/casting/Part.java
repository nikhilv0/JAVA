package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.external.Checkbox;
import com.xworkz.inheritance.external.Component;

public class Part extends Component {
    public void part(Checkbox checkbox){
        checkbox.click();
        checkbox.enable();
        checkbox.disable();
        checkbox.render();
        checkbox.resize();

        if(checkbox instanceof Component){
            Component component=(Component) checkbox;
            System.out.println("running DrawingBoard casting class");
            checkbox.check();
        }

    }
}


