package com.zc.spring.annotation;

public class InjectB {
	String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString(){
		return msg;
	}
}
