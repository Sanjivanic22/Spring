package com.nt.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.cI.Person;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/standaloneCollection/config.xml");
	Person1 p=(Person1) context.getBean("person1");
	System.out.println(p);
	//System.out.println(p.getFriends().getClass());
	System.out.println(p.getFeesStructor());
}
}
