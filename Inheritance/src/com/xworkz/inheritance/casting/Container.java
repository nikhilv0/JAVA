package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.external.Component;
import com.xworkz.inheritance.external.Table;

public class Container extends Component {
    public void contain(Table table){
        table.click();
        table.enable();
        table.disable();
        table.render();
        table.resize();

        if(table instanceof Component){
            Component component=(Component) table;
            System.out.println("running DrawingBoard casting class");
            table.add();
        }

    }
}
