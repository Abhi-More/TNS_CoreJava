package org.tnsif.finalkeyword;

class Laptop
{
	final String brand="Lenova";
	final String LaptopName()
	{
		return brand;
		
	}
}
public class FinalMethod extends Laptop {

	// we can't override final keyword
//	final String LaptopName()
//	{
//		return brand;
//		
//	}
	
	public static void main(String[] args) {
		
		FinalMethod s=new FinalMethod();
		System.out.print(s.LaptopName());
	}

}