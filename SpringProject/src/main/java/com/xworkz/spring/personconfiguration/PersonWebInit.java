package com.xworkz.spring.personconfiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PersonWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public PersonWebInit(){
        System.out.println("running tomcat in InternalConfiguration");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{PersonConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
