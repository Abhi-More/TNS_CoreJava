package org.tnsif.userdefinedexception;

import java.util.Scanner;

public class ExceptionDriver {

	public static void main(String[] args) /*throws LoginException */ {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter userID : ");
		String uID = sc.nextLine();
		System.out.print("Enter Password : ");
		String password = sc.nextLine();
		
		if(uID.equals("abhishek@gmail.com") && password.equals("Abhishek"))
		{
			System.out.println("Login Successfully");
		}
		else
		{
//			throw new LoginException("Invalid Credentials !!");
			
			try {
				throw new LoginException("Invalid Credentials !!");
			}
			catch (LoginException e) {
				System.out.println(e.toString());
			}
		}

	}

}
