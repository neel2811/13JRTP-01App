package com.nit.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        
        ApplicationContext ap =new ClassPathXmlApplicationContext("com/nit/di/config.xml");
        Employee emp1 =(Employee)ap.getBean("emp1");
        System.out.println(emp1);
    }
}
