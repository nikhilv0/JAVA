package com.workz.springmain.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Const");
    }
}
