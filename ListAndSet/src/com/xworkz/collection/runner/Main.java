package com.xworkz.collection.runner;

import com.xworkz.collection.list.ExampleForList;
import com.xworkz.collection.set.ExampleForSet;

public class Main {
    public static void main(String[] args) {
        ExampleForList list=new ExampleForList();
        list.run();
        System.out.println("==========================");
        ExampleForSet set=new ExampleForSet();
        set.save();
    }
}
