package com.healthasyst.employee;

public class Employee {
	public int empid;
	public String empName;
	public double empSalary;
	public static String companyName;

	/*public static void printEmployeeDetails(Employee emp) {
		System.out.println(emp.empid);
		System.out.println(emp.empName);
		System.out.println(emp.empSalary);
		System.out.println(Employee.companyName);
		System.out.println("----------------------------");
	}*/
	
	
	public void printEmployeeDetail()
	{
		System.out.println(this.empid);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
		System.out.println("----------------------------");
	}

}
