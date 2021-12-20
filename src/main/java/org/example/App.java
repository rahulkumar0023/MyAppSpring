package org.example;

import org.example.config.AppConfig;
import org.example.config.DevConfig;
import org.example.config.ProdConfig;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      // System.setProperty("spring.profiles.active","dev");
        ApplicationContext ctx = new AnnotationConfigApplicationContext("org.example");
        System.out.println("Loaded application context");

        MyService myService = ctx.getBean(MyService.class);

        myService.doBusinessLogic();
        System.out.println("My Service bean retrieved ");

        ((AbstractApplicationContext)ctx).close();
    }
}
