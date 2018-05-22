package com.scsa.java.array;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		Random r=new Random();
		/*int x=r.nextInt()%45;
		x=(x>0)? x: -1*x;*/
		for (int i=1;i<=6;i++) {
		int x=r.nextInt(45)+1;
		System.out.println(x);
		}
	}

}
