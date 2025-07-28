package com.xworkz.spring.girlconfiguration;

import com.xworkz.spring.internalconfiguration.InternalConfiguration;
import com.xworkz.spring.personconfiguration.PersonConfiguration;
import com.xworkz.spring.placeconfiguration.PlaceConfiguration;
import com.xworkz.spring.thingconfiguration.ThingConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public WebInit(){
        System.out.println("running tomcat in InternalConfiguration");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{GirlConfiguration.class, InternalConfiguration.class, PersonConfiguration.class, PlaceConfiguration.class, ThingConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }

//    @Override
//    protected String getServletName() {
//        return "dispatcher2";
//    }
}
