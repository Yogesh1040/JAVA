package assignment1;

import java.util.Scanner;

public class Temperature 
{
	private float celsius;
	private float fahrenheit;
	
	public void fahToCel(float temp)
	{
		celsius=(float)(temp-32)*5/9;
		System.out.println("Temperature in Celsius is "+Math.round(celsius));
	}
	
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit - ");
		float temp=s.nextFloat();
		
		Temperature t= new Temperature();
		t.fahToCel(temp);
	}

}
