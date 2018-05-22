package com.scsa.java.loop2;

import java.util.Scanner;

public class LoopTest3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
