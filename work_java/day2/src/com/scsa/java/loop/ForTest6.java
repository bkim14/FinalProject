package com.scsa.java.loop;
import java.util.Scanner;
public class ForTest6 {
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		int x=0;
		while(true) {
		x=scan.nextInt();
		if (x==0) break;
		sumEven(x);
		sumOdd(x);
		sumMulti(x,5);
		
		}
	}//main end
	
	
	public static void sumEven(int x) {
		
		int sum=0;
		
		for(int i=1;i<=x;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
			
		}
		System.out.println("짝수의 합:"+sum);
	}//end sumEven
public static void sumOdd(int x) {
		
		int sum=0;
		
		for(int i=1;i<=x;i=i+2) {
				sum=sum+i;
			
			
		}
		System.out.println("홀수의 합:"+sum);
	}//end sumOdd

public static void sumMulti(int x,int y) {
	
	int sum=0;
	
	for(int i=y;i<=x;i=i+y) {
			sum=sum+i;
		
		
	}
	System.out.println(y+"의 배수의 합:"+sum);
}//end sumMulti	
	
}
