package com.xworkz.exception.creator;

import javax.sound.sampled.LineUnavailableException;

public class Exceptionss {

    public void checkedEvent() throws LineUnavailableException{
//this is for checked event

        if (true){
            System.out.println("run");
            throw new LineUnavailableException("just trying to check the exception");
        }

//        this is for unchecked events
        else throw new RuntimeException();
    }
}
