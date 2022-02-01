package com.healthasyst.loops;

public class LoopsDemo {

	public static void main(String[] args) {
	/*	String[] colors=new String[3];
		colors[0]="yellow";
		colors[1]="green";
		for(int i=0;i<=1;i++)
		{
			System.out.println(colors[i]);
		}*/
		
		int[] numbers= {10,65,87,65,25,33,49,58,79,66};
		
		//int size=numbers.length;
		//System.out.println(size);
		
		//for(int i=0;i<size;i++)
		//{
		//	if(numbers[i]<=50)
		//	{
		//		System.out.println(numbers[i]);
		//	}
			
		//}
		for(int num : numbers)
		{
			System.out.println(num);
		}
		
		String[] colors= {"red","green","yellow","blue"};
		
		for(String s : colors)
		{
			System.out.println(s);
		}

	}

}
