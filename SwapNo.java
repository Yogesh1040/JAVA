package assignment1;

import java.util.Scanner;

public class SwapNo 
{
	private int x,y;
	public void swapno(int x, int y)
	{
		int temp;
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swap x-"+x+" y-"+y);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers x and y - ");
		int x=s.nextInt();
		int y=s.nextInt();
		SwapNo sn=new SwapNo();
		sn.swapno(x, y);
	}

}
