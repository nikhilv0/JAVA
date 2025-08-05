package com.workz.springmain.runner;

import com.workz.springmain.component.MyController;
import com.workz.springmain.component.MyService;
import com.workz.springmain.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Creating Spring Container
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Getting bean using getBean()
        System.out.println("Using getBean()");
        MyService service = context.getBean(MyService.class);
        service.doSomething();

        // Autowired bean
        System.out.println("Using Autowired");
        MyController controller = context.getBean(MyController.class);
        controller.process();
    }
}
