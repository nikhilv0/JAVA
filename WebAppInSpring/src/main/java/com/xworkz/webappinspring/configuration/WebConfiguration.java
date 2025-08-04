package com.xworkz.webappinspring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class WebConfiguration {

    public WebConfiguration() {
        System.out.println("WebConfiguration Constructor");
    }
}
