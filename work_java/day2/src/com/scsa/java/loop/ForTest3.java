package com.scsa.java.loop;
//1~100까지 3의 배수 중 15번째 배수를 출력하라
public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt=0;
		for (int i=1;i<=100;i++) {
			if (i%3==0) {
				cnt=cnt+1;
			}
		}
		System.out.println(cnt);
	}

}
