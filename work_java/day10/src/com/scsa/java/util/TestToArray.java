package com.scsa.java.util;

import java.util.ArrayList;
import java.util.List;

public class TestToArray {
	public static void main(String[] args) {
		List<String> msgs=new ArrayList<>();
		msgs.add(new String("seoul"));
		msgs.add("abc");
		msgs.add("busan");
		msgs.add("inchon");
		Object[] ob=msgs.toArray();
		
		for (Object oo:ob) {
			System.out.println(oo);
		}
		System.out.println("=======");
		String[] ss=new String[msgs.size()];
		msgs.toArray(ss);
		for (String s:ss) {
			System.out.println(s);
		}
		System.out.println("=======");
		String[] mm=msgs.toArray(ss);
		for (String s:mm) {
			System.out.println(s);
		}
		
	}

}
