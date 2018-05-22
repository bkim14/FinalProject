package com.scsa.java.loop2;

import java.util.Scanner;

public class LoopTest6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=1;
		int x=scan.nextInt();
		for(int i=1;i<=x;i++) {
			for (int j=1;j<=x+i-1;j++) {
				System.out.printf("%3d", m++);
			}
			System.out.println();
		}
		
	}

}
