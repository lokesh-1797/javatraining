package com.healthasyst.assignments;

public class Assignment3 {

	public static void main(String[] args) {
		float[] temperatures= {10.2f,40f,3.3f,3.0f,4,5.0f,0.6f,33.3f,3.6f};
		float max=temperatures[0],min=temperatures[0];
		for(int i=1;i<temperatures.length;i++)
		{
			if(temperatures[i]>max)
			{
				max=temperatures[i];
			}
			
			if(temperatures[i]<min)
			{
				min=temperatures[i];
			}
			
			
		}
		System.out.println("Maximum temperature="+max);
		System.out.println("minimun temperature="+min);

	}

}
