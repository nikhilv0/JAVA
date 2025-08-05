package com.workz.springmain.component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    @Autowired
    private MyService myService;

    public void process() {
        System.out.println("Inside Controller");
        myService.doSomething();
    }
}
