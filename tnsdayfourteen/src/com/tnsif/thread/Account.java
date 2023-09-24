package com.tnsif.thread;

public class Account implements Bank{
	int acc_number;
	String name;
	int balance;

	public Account(int acc_number, String name, int balance) {
		// TODO Auto-generated constructor stub
		this.acc_number = acc_number;
		this.balance = balance;
		this.name = name;
	}

	public int getAcc_number() {
		return acc_number;
	}

	public void setAcc_number(int acc_number) {
		this.acc_number = acc_number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public synchronized void deposite(int amount) throws DepositeLimitExceedException {
		// TODO Auto-generated method stub
		if(amount > Bank.DEPOSIT_LIMIT)
				throw new DepositeLimitExceedException();
		
		balance += amount;
		
	}

	@Override
	public synchronized void withdraw(int amount) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		if(amount > balance - Bank.MINIMUM_BALANCE) {
			throw new InsufficientBalanceException();
		}
		balance -= amount;
		
	}
	
	public String toString() {
		return "Account No : " + acc_number + " Name : " + this.name + " Balance : " + this.balance;
	}

}
