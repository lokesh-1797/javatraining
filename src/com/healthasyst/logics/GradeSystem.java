package com.healthasyst.logics;

public class GradeSystem {

	public static void main(String[] args) {
		int marks=60;
		if (marks >=90)
		{
			System.out.println("A");
		}
		else if(marks>=80 && marks<90)
		{
			System.out.println("B");
		}
		else if(marks>=60 && marks<80)
		{
			System.out.println("C");
		}
		else if( marks<60)
		{
			System.out.println("F");
		}

	}

}
