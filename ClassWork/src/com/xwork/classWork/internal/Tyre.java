package com.xwork.classWork.internal;

public class Tyre extends Rubber {
    @Override
    public void expand(){
        System.out.println("running expand in class tyre");
    }
    public void compress(){
        System.out.println("running coompress in class tyre");
    }
}
