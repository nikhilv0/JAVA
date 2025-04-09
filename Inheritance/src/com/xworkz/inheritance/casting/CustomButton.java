package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.external.Button;
import com.xworkz.inheritance.external.Component;

public class CustomButton extends Component {
    public void press(Button button){
        button.click();
        button.enable();
        button.disable();
        button.render();
        button.resize();

        if(button instanceof Component){
            Component component=(Component) button;
            System.out.println("running CustomButton casting class");
            button.customise();
        }

    }
}
