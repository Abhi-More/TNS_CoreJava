package org.tnsif.classandobject;

public class EmployeeAndLibraryExecutor {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empID = 101;
		e1.empName = "Abhishek";
		e1.salary = 1234567;
		e1.department = "Computer";
		
		e1.display();
		
		
		// Library class to demonstrate constructor
		Library lib1 = new Library();
		System.out.println(lib1);  // we can use lib1.toString()
		
		Library lib2 = new Library(100, "Nashik");
		System.out.println(lib2);

	}

}
