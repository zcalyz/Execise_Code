package com.zc.spring.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {
	String message = "hello";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		context.start();
		Hello bean = (Hello) context.getBean("hello");
		System.out.println(bean.getMessage());
		context.stop();
	}
}
