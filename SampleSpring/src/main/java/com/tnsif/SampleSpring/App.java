package com.tnsif.SampleSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext var = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Customer c1 = var.getBean("customer2",Customer.class);
        c1.order();
    }
}
