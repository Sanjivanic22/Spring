package com.srpingcore.LifeCycleMethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//using interaface of life cycle method
//implement InitializingBean,DisposableBean
public class Pepsi implements InitializingBean,DisposableBean{
private double price;

public Pepsi() {
	super();
	
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

public void afterPropertiesSet() throws Exception {//init
	System.out.println("Taking pepsi:init");
	
	
}

public void destroy() throws Exception {//destroy 
System.out.println("Going to put bootele to shop after drinking");
}

}