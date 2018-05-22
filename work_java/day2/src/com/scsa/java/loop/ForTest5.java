package com.scsa.java.loop;

import java.util.Scanner;

public class ForTest5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x=0;
		while (true) {
			x = scan.nextInt();
			if (x == 0)
				break;
			compute(x);
			
		}

	}// end main

	public static void compute(int x) { // method

		int cnt = 0;
				
		for (int i = 1; i <= 100; i++) {
			
			if(i%x==0) {cnt++;}
		}
		System.out.println(cnt);
	}

}// end class
