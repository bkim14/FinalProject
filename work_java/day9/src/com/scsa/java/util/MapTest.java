package com.scsa.java.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		/*Map m=new HashMap();
		m.put("city", "seoul");
		m.put("age",20);
		m.put("����", "��");
		System.out.println(m.get("age"));*/
		
		Map<Integer, String> m =new TreeMap<>();
		m.put(10, "Kim");
		m.put(20, "dadad");
		m.put(30, "Kang");
		System.out.println(m.get(50));
		m.put(30, "KKK");

		for (Object key:m.keySet()) {
			System.out.println(key+":"+m.get(key));
		}
		System.out.println(m);
		
		
	}
}
