package com.demo.Assignment1_Modified;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	Employee c=(Employee) context.getBean("cl");
    	Employee p=(Employee) context.getBean("pg");
    	Employee m=(Employee) context.getBean("mg");
    	System.out.println("-----Employee Details-----");
    	System.out.println(c);
    	System.out.println(p);
    	System.out.println(m);
    	System.out.println("-----Appraisal-----");
    	c.raiseSalary();
    	p.raiseSalary();
    	m.raiseSalary();
    	System.out.println("-----After Appraisal-----");
    	System.out.println(c);
    	System.out.println(p);
    	System.out.println(m);
    }
}
