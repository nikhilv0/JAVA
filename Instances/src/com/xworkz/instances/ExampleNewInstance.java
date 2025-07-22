package com.xworkz.instances;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExampleNewInstance {
    public static void main(String[] args) {


    {
        try {
            Class<?> clazz = Class.forName("com.xworkz.instances.Classes");
            Object obj = clazz.newInstance();

            Method method = clazz.getMethod("run");

            method.invoke(obj);

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    }
}
