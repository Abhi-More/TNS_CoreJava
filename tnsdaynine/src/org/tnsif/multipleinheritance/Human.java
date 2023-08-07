package org.tnsif.multipleinheritance;

public class Human implements ColdDrink, AlcoholDrink{
	public void showDrink()
	{
		System.out.println("Coldrink Name : " + coldDrinkName + ", Alcohol Drink " + alcoholDrinkName);
	}
}
