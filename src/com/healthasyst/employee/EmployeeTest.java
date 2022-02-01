package com.healthasyst.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		Employee.companyName="HA";
		
		emp1.empid=101;
		emp1.empName="john";
		emp1.empSalary=6000;
		
		
		emp2.empid=102;
		emp2.empName="peter";
		emp2.empSalary=2000;
		
		
		emp3.empid=103;
		emp3.empName="mark";
		emp3.empSalary=4000;
		
		emp1.printEmployeeDetail();
		
		/*
		Employee.printEmployeeDetails(emp1);
		Employee.printEmployeeDetails(emp2);
		Employee.printEmployeeDetails(emp3);
		
		
		System.out.println(emp1.empid);
		System.out.println(emp1.empName);
		System.out.println(emp1.empSalary);
		System.out.println(Employee.companyName);
		
		System.out.println(emp2.empid);
		System.out.println(emp2.empName);
		System.out.println(emp2.empSalary);
		System.out.println(Employee.companyName);
		
		
		System.out.println(emp3.empid);
		System.out.println(emp3.empName);
		System.out.println(emp3.empSalary);
		System.out.println(Employee.companyName);
		*/
		

	}

}
