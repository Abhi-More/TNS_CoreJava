package com.tnsif.thread;
class Demo {
	static final int DEPOSIT_LIMIT;
	static 
	{
		DEPOSIT_LIMIT = 5000;
	}
}
public interface Bank {
	int DEPOSIT_LIMIT = 25000;
	final int MINIMUM_BALANCE = 1000;
	
	void deposite(int amount) throws DepositeLimitExceedException;
	void withdraw(int amount) throws InsufficientBalanceException;
}
