/*
 * ques2: A microwave oven manufacturer recommends that when heating two items at 50% to the heating time, & when the heating 3 items  double the heating time. Heating more than 3 items at once is not recommended. write a prog to find out the recommended heating time.
 * 
 * INPUT: total no of items=2 , heating time = 5.0 (50%+5.0) 
 * ans 7.5
 * */

package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MicrowaveOven {
	
	static void recommendHeatingTIme(int noi, int heatingTime) {
		switch (noi) {
		case 1:
			System.out.println("Heating time: " + heatingTime);
			break;
		case 2:
			System.out.println("Heating time: " + heatingTime/2);
			break;
		case 3:
			System.out.println("Heating time: " + 2*heatingTime);
			break;
		default:
			System.out.println("Not recommended");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of items: ");
		int noi = sc.nextInt();
		System.out.println("Enter heating time: ");
		int heatingtime = sc.nextInt();
		
		recommendHeatingTIme(noi, heatingtime);
		

	}

}
