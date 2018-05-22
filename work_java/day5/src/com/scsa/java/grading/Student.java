package com.scsa.java.grading;

public class Student {
	private int num;
	private String name;
	private int java;
	private int db;
	private int web;
	
	public Student() {	
	}
	public void setNum(int num) {
		if(num>=0&&num<=9) {
			this.num=num;
		}
		else {System.out.println("학번오류");}
	}
		
	
	public void setName(String name) {	
		if (name.length()>50) {
			System.out.println("이름 오류");
		}
		else {
			for (int i=0;i<name.length();i++) {
				if ((int)name.charAt(i)<65||(int)name.charAt(i)>90) {
					System.out.println("이름 오류");
					break;
				}
				else {
					this.name=name;
				}
				}
			}
		}
		
	
	public void setJava(int java) {	
		if(num>=0&&num<=100) {
			this.java=java;
		}
		else {System.out.println("자바점수오류");}
	}

	public void setDb(int db) {	
		if(num>=0&&num<=100) {
			this.num=num;
		}
		else {System.out.println("db점수오류");}
	
	}
	public void setWeb(int web) {	
		if(num>=0&&num<=100) {
			this.web=web;
		}
		else {System.out.println("웹점수 오류");}
	}
	

	public int getNum() {	
		return num;
	}
	public String getName() {	
		return name;
	}
	public int getJava() {	
		return java;
	}
	public int getDb() {	
		return db;
	}
	public int getWeb() {	
		return web;
	}
	
	public Student(int num, String name, int java, int db, int web) {
		setNum(num);
		setName(name);
		setJava(java);
		setDb(db);
		setWeb(web);
		
	}
	public int sum() {
		return java+db+web;
	}
	public double average() {
		return (double)(java+db+web)/3;
	}
	public String toString() {
		return num+"||"+name+"||"+java+"||"+db+"||"+web;
	}
}
