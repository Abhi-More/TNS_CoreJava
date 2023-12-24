package com.tnsif.bankapplication;

public class MMSavingAcc extends SavingAcc{
	private static final float MINBAL = 1000f;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}

	@Override
	public void withdraw(float amt) {
		super.withdraw(amt);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void deposite(float amt) {
		
	}
}
