package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MovieTicket {
	
	static void calculatePrice(int age, float time) {
		if(age < 13) {
			if(time < 18.0) {
				System.out.println("Ticket Price : $4.00");
			}
			else
			{
				System.out.println("Ticket Price : $2.00");
			}
		}
		else {
			if(time < 18.0) {
				System.out.println("Ticket Price : $8.00");
			}
			else
			{
				System.out.println("Ticket Price : $5.00");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Age and Time of show: ");
		int age = sc.nextInt();
		float time = sc.nextFloat();
		
		calculatePrice(age, time);

	}

}
