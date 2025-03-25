package com.xwork.AcessModifier;

import com.xworkz.AccessSpecifer.Destiny;
import com.xworkz.AccessSpecifer.Travel;

public class Traveller {
    void travellerdis(){
        Travel travel=new Travel();
        travel.Kms();
        System.out.println("Distance"+travel.distance);
        Destiny destiny=new Destiny(travel);
        destiny.destinydisplay();
    }
}
