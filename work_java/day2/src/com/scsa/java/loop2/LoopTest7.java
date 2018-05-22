package com.scsa.java.loop2;

import java.util.Scanner;

public class LoopTest7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=1;
		int x=scan.nextInt();
		for(int i=1;i<=x;i++) {
			for (int k=1;k<=x-i;k++) {
				System.out.print("   ");
			}
			for (int j=1;j<=i;j++) {

				System.out.printf("%3d", m++);
			}
			System.out.println();
		}
		
	}

}
