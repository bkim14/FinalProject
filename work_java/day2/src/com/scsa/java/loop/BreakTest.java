package com.scsa.java.loop;

public class BreakTest {

	public static void main(String[] args) {
		 int k=5;
		 while(k<8) {
			 for(int i=1;i<k;i++) {
				System.out.println("before:"+i);
				if(i>3)break;
				System.out.println("after"+i);
			 }
			 k++;
		 }

	}

}
