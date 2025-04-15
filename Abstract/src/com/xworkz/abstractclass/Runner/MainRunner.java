package com.xworkz.abstractclass.Runner;

import com.xworkz.abstractclass.external.*;
import com.xworkz.abstractclass.internal.Aryan;

public class MainRunner {
    public static void main(String[] args) {
        TestMatch testMatch=new TestMatch();
        testMatch.match();

        Villa villa=new Villa();
        villa.cons();

        Xworkz xworkz=new Xworkz();
        xworkz.complete();
        xworkz.incomplete();
//        is it possible

        ChadiBuddy chadiBuddy=new ChadiBuddy("Hickey","Alyan",'F');
        chadiBuddy.print();

        Subbamma subbamma=new Subbamma("Nayana amma","Subbi");
        Subbamma subbamma1=new Subbamma(true);
        Subbamma subbamma2=new Subbamma('M');
        subbamma.display();

    }
}
