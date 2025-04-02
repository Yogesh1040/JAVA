package assignment1;

import java.util.Scanner;

public class Circle 
{
	private float radius;
	private float area;
	
	public void inIt(float rad)
	{
		radius=rad;
	}
	
	public float calArea()
	{
		area=(float)(3.14*radius*radius);
		return area;
	}
	
	public void display()
	{
		System.out.println("Area of circle is "+calArea());
	}
	
	public static void main(String args[])
	{
		Circle c1=new Circle();
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a radius - ");
		float rad=s.nextFloat();
		c1.inIt(rad);
		c1.display();
	}

}
