package org.tnsif.uncheckedexception;

public class ThrowAndThrowsKeyword {

	static void isEligible(int age) throws ArithmeticException
	{
		if(age > 18)
		{
			System.out.println("You are eligible");
		}
		else
		{
			int x = 20 / age;
//			throw new ArithmeticException("Criteria no matched");
		}
	}
	
	public static void main(String[] args)
	{
//		try {
			isEligible(0);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}

	}

}
