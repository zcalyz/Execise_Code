package com.zc.spring.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Tool {
	
	@Qualifier("InB_2")
	@Autowired
	InjectB injectB;
	
	@Autowired
	InjectA inject;
	@Resource(name="InB_1")
	InjectB injectB_1;

	public void setInjectA(InjectA injectA) {
		this.inject = injectA;
	}
	
	public void testInj(){
//		inject.in();
		System.out.println(injectB);
		System.out.println(injectB_1);
	}
}
