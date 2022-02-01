package com.healthasyst.methods;

public class MethodsDemo {
	
	public static double areaofcircle(int r)
	{
		double area=3.14*r*r;
		return area;
	}
	
	//area of triangle
	public double areaOfTriangle(int b, int h)
	{
	double areaT = (double)(b * h) / 2;
	return areaT;
	}

	public static void main(String[] args) {
		MethodsDemo obj=new MethodsDemo();
		int radius=10;
		double result=MethodsDemo.areaofcircle(radius);
		System.out.println("area of circle is "+result);
		System.out.println("Area of triangle is "+obj.areaOfTriangle(1, 25));
		
		System.out.println(Math.random());
	}

}
