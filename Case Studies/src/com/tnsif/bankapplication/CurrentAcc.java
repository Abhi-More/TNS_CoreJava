package com.tnsif.bankapplication;

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	@Override
	public void withdraw(float amt) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
