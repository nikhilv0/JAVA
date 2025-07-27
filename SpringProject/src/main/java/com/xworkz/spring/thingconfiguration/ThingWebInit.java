package com.xworkz.spring.thingconfiguration;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ThingWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public ThingWebInit() {
        System.out.println("ThingWebInit Comstructor");
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ThingConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

}
