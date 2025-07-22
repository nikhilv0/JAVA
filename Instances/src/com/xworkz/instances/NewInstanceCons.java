package com.xworkz.instances;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NewInstanceCons {
    public static void main(String[] args) {
        {
            try {
                Class<?> aClass = Class.forName("com.xworkz.instances.Classes");
                Constructor<?> constructor = aClass.getConstructor(String.class, int.class);
                Object ob= constructor.newInstance("hi",1);

                System.out.println(ob);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                     InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
