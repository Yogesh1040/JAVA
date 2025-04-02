package assignment1;

import java.util.Scanner;

public class Reverse 
{
	private int x;
	
	public int rev(int x)
	{
		int temp=0;
		while(x>0)
		{
			temp=temp+x%10;
			x=x/10;
			if(x>0) {temp=temp*10;}
		}
		return temp;
	}
	
	public static void main(String arg[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x=s.nextInt();
		Reverse r= new Reverse();
		System.out.println("Reverse of number is : "+r.rev(x));
	}

}
