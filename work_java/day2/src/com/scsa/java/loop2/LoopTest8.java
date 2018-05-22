package com.scsa.java.loop2;

import java.util.Scanner;

public class LoopTest8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=1;
		int x=scan.nextInt();
		for(int i=1;i<=x;i++) {
			for (int k=1;k<=x-i;k++) {
				System.out.print("   ");
			}
			for (int j=1;j<=2*i-1;j++) {

				System.out.printf("%3d", m++);
			}
			for (int k=1;k<=x-i;k++) {
				System.out.print("   ");
			}
			System.out.println();
		}
		
	}

}
