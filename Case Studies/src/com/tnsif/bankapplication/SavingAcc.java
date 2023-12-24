package com.tnsif.bankapplication;

public abstract class SavingAcc extends BankAcc{
	private boolean isSalaried;
	private static final float MINBAL = 1000f;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	
	@Override
	public void withdraw(float amt) {
		
	}
	
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
}
