package com.healthasyst.assignments;

public class Assignment2 {

	public static void main(String[] args) {
		int sum=0,i,n=10;
		
		for(i=1;i<=n;i=i+2)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		
		System.out.println("Sum of odd numbers till "+n+" ="+sum);
		
	}

}
