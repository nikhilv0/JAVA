package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.external.Canvas;
import com.xworkz.inheritance.external.Component;

public class DrawingBoard extends Component {
    public void draw(Canvas canvas){
        canvas.click();
        canvas.enable();
        canvas.disable();
        canvas.render();
        canvas.resize();

        if(canvas instanceof Component){
            Component component=(Component) canvas;
            System.out.println("running DrawingBoard casting class");
            canvas.operate();
        }

    }
}

