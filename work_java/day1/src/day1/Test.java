package day1;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하세요");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();//s메모리에 있는 넥스트 인트라는 메소드를 가져온다.
		int b=s.nextInt();
		
		int result=a+b;
		System.out.println("덧셈:" + result);

		result=a-b;
		System.out.println("뺼셈:"+result);
		result=a*b;
		System.out.println("곱셈:"+result);
		result=a/b;
		System.out.println("나눗셈:"+result);
		result=a%b;
		System.out.println("나머지:"+result);
		
		double d=a;
		System.out.println(d);
		float f=3.6f;
		System.out.println(f);
		char c='A';
		int k=c;
		System.out.println(k);
	}

}
