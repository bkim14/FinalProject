package com.scsa.java.loop;
//do while�� ������ ������ �� �������� �� ����������
public class BreakTest3 {

	public static void main(String[] args) {
		 int k=5;
		 boolean exit=false;
		 do {
			 for(int i=1;i<k;i++) {
				System.out.println("before:"+i);
				if(i>3) {
					exit=true;
					break;
				}
				System.out.println("after"+i);
			 }
			 
		 }while(++k<8 && (!exit));

	}

}
