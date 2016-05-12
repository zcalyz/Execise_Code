package com.asm.test;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test1 {
	Test1 test1;
	public static void main(String[] args) {
/*		int a  = 1;
		if( a > 10){
			a++;
		}else{
			System.out.println("k");
		}
		HashMap<String, String> hashMap = new HashMap<String,String>();*/
		new Test1().TreeMapMethod();
	}
	
	public void method(String k){
		test1 = new Test1();
	}
	
	public void TreeMapMethod(){
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(2, "b");
		treeMap.put(1, "a");
		treeMap.put(10, "k");
		treeMap.put(5, "d");
		System.out.println(treeMap);
		Set<Entry<Integer, String>> entrySet = treeMap.entrySet();
		for(Entry<Integer, String> entry : entrySet){
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
