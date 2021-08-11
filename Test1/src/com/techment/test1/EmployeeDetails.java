package com.techment.test1;

class Employee {
	
	String firstName;
	String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String toString() {
		return "Employee [first name=" + firstName + ", last name=" + lastName +"]";
	}


}


public class EmployeeDetails{
	
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Nishita", "Toshi");
		Employee employee2 = new Employee("Mohima", "Sinha");
		Employee employee3 = new Employee("Himanshi", "Garg");
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);


	}
}