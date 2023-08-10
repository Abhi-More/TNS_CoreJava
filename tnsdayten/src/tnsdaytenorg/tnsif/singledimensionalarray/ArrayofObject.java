package tnsdaytenorg.tnsif.singledimensionalarray;
import java.util.*;
public class ArrayofObject {

	public static void main(String[] args) {
		
		Employee[] array = new Employee[3];
		
		array[0] = new Employee(1, "Abhishek More", 34567.5678d);
		array[1] = new Employee(1, "Sandip Zalte", 3234567);
		array[2] = new Employee(3, "Saish Thorat", 134567.78d);
		
		
		for(Employee emp : array)
		{
			System.out.println(emp.getId() + "  " + emp.getName() + "  " + emp.getSalary());
		}

	}

}
