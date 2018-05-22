package day1;
import java.util.Scanner;

public class ScoreTest2 {

	public static void main(String[] args) {

		System.out.println("성적 입력하세요:");
		Scanner s=new Scanner(System.in);
		int score=s.nextInt();
		  
		if(score>=90) {
			System.out.println("A");
		}
		else if (score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		
	}

}
