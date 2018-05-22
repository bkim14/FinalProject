package com.scsa.java.loop;

import java.util.Scanner;

public class ForTest4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=0;
		while(true) {
		x=scan.nextInt();
		int cnt=0;
		int y=x;
		
		if(x==0)break;
		for(int i=x;x<=100;x=x+y) {
			;
			cnt=cnt+1;
			}
		System.out.println(cnt);
		}
		}
}
