package homework;
import java.util.Scanner;

public class Main333 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		
		for (int i=1;i<=x;i++) {
			
			for (int j=2*x-2*i-1;j>=0;j--) {
				System.out.print(" ");
			}
			for (int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
