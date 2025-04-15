package com.xworkz.abstractclass.external;

import com.xworkz.abstractclass.internal.Building;

public class Villa extends Building {
    @Override
    public void cons() {
        System.out.println("running building abstract in villa");
    }
}
