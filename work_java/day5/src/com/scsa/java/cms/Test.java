package com.scsa.java.cms;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Customer c=new Customer();
			
			/*c.name="조동하";
			c.address="화성";
			c.age=28;
			c.info();
			String msg=c.toString();
			System.out.println(msg);
			System.out.println(c.toString());
			System.out.println(c);
			
			Customer c2=new Customer();
			c2.name="이동준";
			c2.address="서울";
			c2.age=28;
			c2.info();
			c2.order();*/
			
			c.setName("이동준");
			c.setAddress("서울");
			c.setAge(28);
			System.out.println(c);
			Customer c2=new Customer("조동하",28);
			System.out.println(c2);
			System.out.println(c.getName().charAt(0));
	}	

}
