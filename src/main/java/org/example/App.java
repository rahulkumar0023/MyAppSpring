package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        System.out.println("Loaded application context");

        MyService myService1 = ctx.getBean(MyService.class);
        MyService myService2 = ctx.getBean(MyService.class);
        MyService myService3 = ctx.getBean(MyService.class);

        System.out.println("My Service bean retrieved " + myService1.hashCode());
        System.out.println("My Service bean retrieved " + myService2.hashCode());
        System.out.println("My Service bean retrieved " + myService3.hashCode());

    }
}
