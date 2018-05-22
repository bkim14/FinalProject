package com.scsa.java.account;

public class MinusAccount extends Account{
	private int limit;

	public MinusAccount() {}
	public MinusAccount(String num, int password, int balance, int limit) {
		super(num, password, balance);
		setLimit(limit);
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	
	public void withdraw(int pw, int money) {
		if (checkPassword(pw)) {
			if(getBalance()+getLimit()>=money) {
				setBalance(getBalance()-money);
			}
			else {System.out.println("한도를 넘었습니다");}
		}else {System.out.println("패스워드 오류");}

	}		
}
