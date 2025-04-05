package assignment3;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your Choice (Circle OR Factorial) : ");
		String choice=s.next();
		System.out.println("Enter data : ");
		int data=s.nextInt();
		
		if(choice.equals("Circle"))
		{
			Processor p=new Circle();
			p.data=data;
			p.process();
			p.showData();
		}
		else if(choice.equals("Factorial"))
		{
			Processor p=new Factorial();
			p.data=data;
			p.process();
			p.showData();
		}
	
	}
	
}