package com.xworkz.spring.internalconfiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class InternalWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public InternalWebInit(){
        System.out.println("running tomcat in InternalConfiguration");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{InternalConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
