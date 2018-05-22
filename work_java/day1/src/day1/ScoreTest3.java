package day1;
import java.util.Scanner;

public class ScoreTest3 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int x=1;
		
		while(x!=0) {
			System.out.println("number? ");
			x=scan.nextInt();
			if(x>0) {
				System.out.println("positive integer");
					
				}
			else if(x<0){
				System.out.println("negative number");
			}
		}
		
		
		
	}

}
