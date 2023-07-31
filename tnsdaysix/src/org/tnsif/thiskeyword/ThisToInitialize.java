package org.tnsif.thiskeyword;

class Account {
	long accountNo;
	
	Account(){}
	
	// this in constructor
	Account(long accountNo) {
		this.accountNo = accountNo;
	}
	
	// this in method
	void setaccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	
	void display() {
		System.out.println(accountNo);
	}
}

public class ThisToInitialize {

	public static void main(String[] args) {
		
		Account object = new Account();
		object.setaccountNo(234563456788997L);
		object.display();
	}

}
