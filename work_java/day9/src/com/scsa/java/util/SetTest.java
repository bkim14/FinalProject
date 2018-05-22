package com.scsa.java.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.scsa.java.car4.Car;

public class SetTest {

	public static void main(String[] args) {
		/*Set s=new HashSet();
		s.add("seoul");
		s.add("busan");
		s.add("incheon");
		//s.add(new Integer(30));
		s.add(30);
		s.add(new Car("1145311",500,"aa"));
		s.add(new Car("1145311",500,"aa"));

		for( Object ob :s) {
			System.out.println(ob);
		}*/
		
		
		Set<String> s=new <String>TreeSet();
		s.add("seoul");
		s.add("busan");
		s.add("incheon");
		s.add("30");
		s.add(new Car("1145311",500,"aa").toString());
		s.add(new Car("1145311",500,"aa").toString());
		
		Iterator<String> si=s.iterator();
		while(si.hasNext()) {
			System.out.println(si.next());
		}
		for( String ob :s) {
			System.out.println(ob);
		}
		
	}

}
