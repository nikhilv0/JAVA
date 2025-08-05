package com.workz.springmain.component;

import org.springframework.stereotype.Component;

@Component
public class MyService {

    public void doSomething() {
        System.out.println("Service running");
    }
}
