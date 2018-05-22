package homework;
import java.util.Scanner;

public class Main334 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int m=0;
		for (int i=1;i<=x;i++) {
			m=1;
			
			for (int j=2*x-2*i-1;j>=0;j--) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
			}
		
	}
}
