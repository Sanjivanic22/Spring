package com.nt.main.AutoAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/main/AutoAnnotation/Autoconfig.xml");
		//Address address=(Address)context.getBean("emp");
		Employee emp=(Employee) context.getBean("emp");
		System.out.println(emp);

	}

}
