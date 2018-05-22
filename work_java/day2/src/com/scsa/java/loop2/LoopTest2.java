package com.scsa.java.loop2;
import java.util.Scanner;


public class LoopTest2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char c=scan.next().charAt(0);
		
		for (int row=1;row<=5;row++){
			for (int column=1;column<=5;column++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
