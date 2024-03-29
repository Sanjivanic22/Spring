package com.spring.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/Collection/config.xml");
	Employee emp=(Employee)context.getBean("employee");
	System.out.println(emp.getId());
	System.out.println(emp.getPhones());
	System.out.println(emp.getAddresses());
	System.out.println(emp.getCourses());
	System.out.println(emp.getProps());
	System.out.println(emp.getPhones().getClass().getName());
}
}
