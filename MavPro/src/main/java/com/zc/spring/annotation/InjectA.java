package com.zc.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class InjectA {
	public void in(){
		System.out.println("InjectA");
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Tool tool = (Tool) context.getBean("tool");
		tool.testInj();
	}
}
