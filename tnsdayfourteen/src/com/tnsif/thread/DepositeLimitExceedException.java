package com.tnsif.thread;

public class DepositeLimitExceedException extends Exception {

	public DepositeLimitExceedException() {
		super("Can't Deposite.. Limit is exceeded");
		// TODO Auto-generated constructor stub
	}
	
	public DepositeLimitExceedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
