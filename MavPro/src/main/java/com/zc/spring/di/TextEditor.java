package com.zc.spring.di;


public class TextEditor {
	private SpellCheck check;
	
	public TextEditor(){
		
	}

	public TextEditor(SpellCheck check) {
		// TODO Auto-generated constructor stub
		this.check = check;
	}
	
	
	private SpellCheck2 spellCheck2;
	
	public void setSpellCheck2(SpellCheck2 check2) {
		this.spellCheck2 = check2;
	}
	
	public void check(){
//		check.check();
		spellCheck2.check();
	}
}
