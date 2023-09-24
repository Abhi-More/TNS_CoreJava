package org.tnsif.statickeyword;

class Employee {
	static String companyName;
	String empId;
	String empName;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
//		this.companyName = companyName;
		Employee.companyName = companyName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
//	void display() {
//		System.out.println(this.empName + "  " + this.empId +"  " + this.companyName);
//	}
	
	void display() {
		System.out.println(this.empName + "  " + this.empId +"  " + companyName);
	}
}


public class StaticVariable {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpName("Abhishek");
		e.setEmpId("1");
		e.setCompanyName("Wow Infotech");
		e.display();
		
//		System.out.println(e.companyName);
		System.out.println(Employee.companyName);

	}

}
