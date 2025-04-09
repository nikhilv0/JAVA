package com.xworkz.inheritance.casting;

import com.xworkz.inheritance.external.Card;
import com.xworkz.inheritance.external.Component;

public class UnoCard extends Component {
    public void card(Card card){
        card.click();
        card.enable();
        card.disable();
        card.render();
        card.resize();

        if(card instanceof Component){
            Component component=(Component) card;
            System.out.println("running UnoCard casting class");
            card.delete();
        }

    }
}
