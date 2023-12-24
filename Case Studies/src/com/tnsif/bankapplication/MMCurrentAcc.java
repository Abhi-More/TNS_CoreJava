package com.tnsif.bankapplication;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public void withdraw(float amt) {
		// TODO Auto-generated method stub
		super.withdraw(amt);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void deposite(float amt) {
		// TODO Auto-generated method stub
		
	}
}
