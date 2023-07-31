/*
ques1: write a program to calculate hotel tariff(budget). the room rent is 20% high during a fixed season (april to june, nov to dec). switch case I/P months=3, rent =1500, days=2
*/

package org.tnsif.codingchallenge;
import java.util.*;


public class HotelTarif {

	static void calculateRent(int month, int rent, int days) {
		
		switch (month){
		case 4:
			System.out.println((rent+rent*0.2f) * days);
			break;
		case 5:
			System.out.println((rent+rent*0.2f) * days);
			break;
		case 11:
			System.out.println((rent+rent*0.2f) * days);
			break;
		case 12:
			System.out.println((rent+rent*0.2f) * days);
			break;
		default:
				System.out.println(rent * days);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month: ");
		int month = sc.nextInt();
		System.out.println("Enter rent: ");
		int rent = sc.nextInt();
		System.out.println("Enter days: ");
		int days = sc.nextInt();
		
		calculateRent(month, rent, days);
				
	}

}
