package com.xworkz.spring.girlconfiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GirlWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public GirlWebInit(){
        System.out.println("running tomcat in InternalConfiguration");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{GirlConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
