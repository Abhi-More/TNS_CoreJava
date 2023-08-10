package org.tnsif.uncheckedexception;

public class CatchBlock {

	static void display(int arr[])
	{
		try {
			System.out.println(arr[3]);
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("In Child : " + e.getMessage());
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("in AIOOBE: " + e.getMessage());
//		}
		catch(Exception e) {
			System.out.println("Pakad liya in Parent: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		display(new int[] {1, 2});
	}

}
