package com.zc.spring.di;

public class Editor {
	private SpellCheck check;

	public void setCheck(SpellCheck check) {
		this.check = check;
	}
	
	public void check(){
		check.check();
	}
}
