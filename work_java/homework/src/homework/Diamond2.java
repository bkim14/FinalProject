package homework;

import java.util.Scanner;

public class Diamond2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		char[][] a=new char[2*n-1][2*n-1];
		int h;
		int v;
		int dirh=-1;
		int dirv=1;
		char m='A';
		h=n-1;
		v=0;
		
		for (int j=0;j<4;j++) {
			
			v=j;
			h=n-1;
			for (int i=1;i<=(n-j-1)*4;i++) {
				
				a[v][h]=m;
				m=(char)(m+1);
				if(m==91) {
					m=65;
				}
				
				h=h+dirh;
				v=v+dirv;
				if(v==j||v==2*(n-1)-j) {
					dirv=dirv*-1;
				}
				if(h==j||h==2*(n-1)-j) {    //4, 8
					dirh=dirh*-1;
				}
				
			}
		}
		a[n-1][n-1]=m;	
		
		for (int i=0;i<2*n-1;i++) {
			for (int k=0;k<2*n-1;k++) {
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}
		
		
	}

}
