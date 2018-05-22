package com.scsa.java.account;

public class Account {
	private String num;
	private int password;
	private long balance;
	public Account() {
		super();
	}
	public Account (String num, int password, int balance) {
		setNum(num);
		setPassword(password);
		setBalance(balance);
		
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	private int getPassword() {
		return password;
	}
	public boolean checkPassword(int password) {
		if(this.password==password) {
			return true;
		}
		else { 
			return false;
		}
	}
	void setPassword(int password) {
		this.password = password;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public void deposit(int money) {
		setBalance(getBalance()+money);
	}
	public void withdraw(int pw, int money) {
		if(checkPassword(pw)) {
			if(getBalance()>=money) {
				setBalance(getBalance()-money);
			}
			else {
				System.out.println("잔액 부족");
			}
			
		}
		else {
			System.out.println("비밀번호 오류");
		}
	}
	public String toString() {
		return "Account [num= "+getNum()+" balance= "+getBalance();
	}
}
