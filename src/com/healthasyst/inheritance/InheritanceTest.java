package com.healthasyst.inheritance;

class Parent{
	public int pAge=75;
	
	public Parent()
	{
		System.out.println("Parent");
	}
	public void parentStyle()
	{
		System.out.println("Parent Style");
	}
	
}

class Child extends Parent
{
	public int CAge=45;
	public void childStyle()
	{
		System.out.println("child Style");
	}
}



public class InheritanceTest {

	public static void main(String[] args) {
		
		Child cobj=new Child();
		System.out.println(cobj.CAge);
		System.out.println(cobj.pAge);
		cobj.parentStyle();
		cobj.childStyle();

	}

}
