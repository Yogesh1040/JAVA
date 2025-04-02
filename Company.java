package assignment1;

import java.util.Scanner;

public class Company 
{
	private float Basic;
	
	public double calSal(float Basic)
	{
		if(Basic<1500)
		{
			return Basic+(0.1*Basic)+(0.9*Basic);
		}
		else
			return Basic+500+(0.98*Basic);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Basic Salary : ");
		float Basic=s.nextFloat();
		Company c=new Company();
		System.out.println("Salary = "+c.calSal(Basic));
	}

}
