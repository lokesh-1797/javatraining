package com.healthasyst.assignments;

import com.healthasyst.methods.MethodsDemo;

public class Area {
	

	public static double areaOfSquare(double side) {
		return side * side;
	}

	public static double areaOfTrapezium(double a, double b, double h) {
		double area = (h * (a + b)) / 2;
		return area;
	}

	public static void main(String[] args) {

		System.out.println(areaOfSquare(4));
		System.out.println(areaOfTrapezium(1,2,3));
		
	}
}
