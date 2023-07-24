package org.tnsif.decisionmaking;
import java.util.*;
public class ControlStatement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// if - else
		System.out.print("Enter your age : ");
		float age = sc.nextFloat();
		
		System.out.print("Enter your weight : ");
		float weight = sc.nextFloat();
		
		if(age > 18 && weight > 50)
		{
			System.out.println("You are eligible for blood donation");
		}
		else
		{
			System.out.println("You are not eligible for blood donation");
		}
		
		// cascaded if else
		
		System.out.print("Enter your age1 : ");
		float age1 = sc.nextFloat();
		System.out.print("Enter your age2 : ");
		float age2 = sc.nextFloat();
		System.out.print("Enter your age3 : ");
		float age3 = sc.nextFloat();
		
		if(age1 > age2 && age1 > age3)
		{
			System.out.println("Age 1 is greater : " + age1);
		}
		else if(age2 > age1 && age2 > age3)
		{
			System.out.println("Age 2 is greater : " + age2);
		}
		else
		{
			System.out.println("Age 3 is greater : " + age3);
		}
		
		// nested if
		if(age >= 12)
		{
			if(weight > 40)
			{
				System.out.println("Eligible for bunjee jumping");
					
				if(weight > 110)
				{
					System.out.println("Extra ropes to be added");
				}
			}
			else
			{
				System.out.println("Not eligible");
			}
		}
		
		// switch
		
		System.out.println("Enter song number : ");
		int song_no = sc.nextInt();
		
		switch(song_no)
		{
		case 1:
			System.out.println("Waka Waka");
			break;
		case 2:
			System.out.println("Chakde India");
			break;
		case 3:
			System.out.println("Dangal dangal");
			break;
		case 4:
			System.out.println("Al.. al.. raj.. al.. jinkuniya jag bhari.. Shivba raj nav gaj ji..");
			break;
		default :
			System.out.println("Song is unavailable");
			break;
		}
		
		sc.close();

	}

}
