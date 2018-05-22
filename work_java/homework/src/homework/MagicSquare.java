package homework;

import java.util.Scanner;

public class MagicSquare {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int[][] a=new int[n][n];
		int m=0;
		
		int h=(n-1)/2;
		int v=0;
		for (int i=1;i<=n*n;i++) {
			if (h<0) {
				h=n-1;
			}
			if (v<0) {
				v=n-1;
			}
			if (h>n-1) {
				h=0;
			}
			
			if (a[v][h]!=0) {
				v=v+1;
				h=h+1;
				if (v>n-1) {
					v=0;
				}
				v=v+1;
				if (h>n-1) {
					h=0;
				}
			}
			m++;
			a[v][h]=m;
			
			h=h-1;
			v=v-1;
			
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
