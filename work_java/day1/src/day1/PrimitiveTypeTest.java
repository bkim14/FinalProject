package day1;

public class PrimitiveTypeTest {

	public static void main(String[] args) {
		int a=123;
		long b=a;//자동 형변환
		long c=123L;
		long d=a+30L; //32비트+64비트->64비트로 변환 long대신 int를 넣으면 오류
		int d1=(int) (a+30L);//명시적 형변환
		int e=(int) (30+3.4*2);// 30+6.8=36.8->36
		double f=30/4;// 정수 나누기 정수라서 7이 결과값. f가 더블임으로 7.0으로 담아짐.
		double f2=30/4+2.7;// 7+2.7=9.7
		
		char ch='A';
		System.out.println(ch);
		System.out.println(ch+1);
		System.out.println(++ch);
	}

}
