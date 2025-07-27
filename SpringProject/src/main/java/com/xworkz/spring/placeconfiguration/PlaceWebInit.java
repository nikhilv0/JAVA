package com.xworkz.spring.placeconfiguration;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PlaceWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public PlaceWebInit() {
        System.out.println("ThingWebInit Comstructor");
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{PlaceConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

}
