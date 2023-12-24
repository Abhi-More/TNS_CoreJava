package com.tnsif.bankapplication;

public class Executor {

	public static void main(String[] args) {
		BankFactory bankFact = new MMBankFactory();
		
		SavingAcc sAcc = new MMSavingAcc(101, "Abhishek", 20000f, true);
		CurrentAcc cAcc = new MMCurrentAcc(101, "Abhishek", 20000f, 10000f);
		
		sAcc.toString();
		sAcc.withdraw(100);
		sAcc.toString();
	}

}
