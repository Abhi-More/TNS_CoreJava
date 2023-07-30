package org.tnsif.encapsulation;

//program to demonstrate on encapsulation
//Encapsulation achieve a data hiding using private access 
public class HDFC {

	// private data 
	private String accType;
	private long accNumber;
	private long atmCardNo;
	private int pinNo;
	
	
	public void setBankDetails(String accType,long accNumber,long atmCardNo,int pinNo)
	{
		this.accNumber=accNumber;
		this.accType=accType;
		this.atmCardNo=atmCardNo;
		this.pinNo=pinNo;
	}
	
	public String toString()
	{
		return "accType "+accType+"\naccNumber "+accNumber+"\natmCardNo "+atmCardNo+"\npinNo "+pinNo;
	}

}