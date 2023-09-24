package com.tnsif.thread;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		throw new ClassNotFoundException();
		
		Account accObj = new Account(101, "Abhishek", 10000);
		
		System.out.println(accObj);
		
		AccountThread threadOne = new AccountThread(accObj);
		AccountThread threadTwo = new AccountThread(accObj);
		
		threadOne.setAmount(2000);
		threadOne.setType("withdraw");
		
		System.out.println(accObj);
		
		threadTwo.setAmount(1000);
		threadTwo.setType("withdraw");
		
		threadOne.start();
		threadTwo.start();
		
		try {
			threadOne.join();
			threadTwo.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.print(accObj);
	}

}
