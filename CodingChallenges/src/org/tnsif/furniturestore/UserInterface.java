package org.tnsif.furniturestore;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		String name;
		long phone;
		String address;
		
		Scanner sc = new Scanner(System.in);
		Discount disObj = new Discount();
		
		System.out.print("Enter Customer Name : ");
		name = sc.next();
		System.out.print("Enter Phone Number : ");
		phone = sc.nextLong();
		sc.nextLine();
		System.out.print("Enter Address : ");
		address = sc.nextLine();
		CustomerDetails customer = new CustomerDetails(name, phone, address);
		
		System.out.print("Enter Bero Type : ");
		String beroType = sc.nextLine();

		if(beroType.equals("Wooden Bero"))
		{
			String colour;
			String woodType;
			
			System.out.print("Enter Bero Colour : ");
			colour = sc.nextLine();
			System.out.print("Enter Wood Type : ");
			woodType = sc.nextLine();
			
			WoodenBero woodBero = new WoodenBero(beroType, colour, woodType);
			woodBero.calculatePrice();
			double discount = disObj.calculateDiscount(woodBero);
			System.out.println("Amount needs to be paid : " + String.format("%.2f", woodBero.getPrice() - discount));
			
		}
		else if(beroType.equals("Steel Bero"))
		{
			String colour;
			int height;
			
			System.out.print("Enter Bero Colour : ");
			colour = sc.nextLine();
			System.out.print("Enter Bero Height : ");
			height = sc.nextInt();
			
			SteelBero steelBero = new SteelBero(beroType, colour, height);
			steelBero.calculatePrice();
			double discount = disObj.calculateDiscount(steelBero);
			System.out.println("Amount needs to be paid : " + String.format("%.2f",steelBero.getPrice() - discount));
			
		}
		else
		{
			System.out.println("\n" + beroType + " is an invalid bero type");
		}
	}

}
