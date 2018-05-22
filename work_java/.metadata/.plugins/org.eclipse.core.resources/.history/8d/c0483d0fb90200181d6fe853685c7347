package com.scsa.java.car2;

public class Test {

	public static void main(String[] args) {
		
		Car c=new Car();
		Bus b=new Bus();
		System.out.println(c);
		System.out.println(b);
		c.compute();
		b.compute();
		b.compute2();
		//========Object Polymorphism=======
		Car c1=new Car();
		Car c2=new Bus();
		//=========method Polymorphism======
		c1.compute();
		c2.compute(); 
		c2.compute2();
		
		Bus bb=(Bus)c2;
		Bus b2=(Bus)c1;		//c1은 상위 클라스라 버스를 포함하고 있지 않다. 그래서 형변환 불가.
	}

}
