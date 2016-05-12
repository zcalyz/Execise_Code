package com.zc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zc.spring.di.Editor;
import com.zc.spring.di.JavaCollectionDI;
import com.zc.spring.di.TextEditor;

public class HelloWorld {
	String msg;
	
	public void myInit(){
		System.out.println("Hello World init success");
	}
	
	public void sayHello(){
		System.out.println(msg);
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		TextEditor editor = (TextEditor) context.getBean("textEditor");
		editor.check();
		
		Editor editor2 = (Editor) context.getBean("editor");
		editor2.check();
		
	/*	HelloSub helloObj = (HelloSub) context.getBean("helloSub");
		helloObj.say();
		
		TextEditor editor = (TextEditor) context.getBean("textEditor");
		editor.check();*/
		
		//collection injection
	/*	JavaCollectionDI coll = (JavaCollectionDI) context.getBean("javaCollectionDI");
		System.out.println(coll.getAddressList());
		System.out.println(coll.getAddressSet());
		System.out.println(coll.getAddressMap());
		System.out.println(coll.getPro());*/
		
		/*
		helloObj.setMessage("hello");
//		helloObj.sayHello();
		HelloWorld helloObj2 = (HelloWorld) context.getBean("helloWorld");
//		helloObj2.sayHello();
*/	}
}
