package day1;
import java.util.Scanner;

public class ScoreTest1 {

	public static void main(String[] args) {

		System.out.println("성적 입력하세요:");
		Scanner s=new Scanner(System.in);
		int score=s.nextInt();
		
		if(score>=70) {
			System.out.println("합격~");
		}
		else {
			System.out.println("불합격ㅗㅗ");
		}
		
	}

}
