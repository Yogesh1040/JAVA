package assignment1;

import java.util.Scanner;

public class GroupScore 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Student stud[]= new Student[10];
		System.out.println("-----------Enter Student Details -----------");
		for(int i=0; i<10; i++)
		{
			System.out.println("Enter Student Name - ");
			String name=s.next();
			System.out.println("Enter Roll no - ");
			int rollNo=s.nextInt();
			System.out.println("Enter Age - ");
			int age=s.nextInt();
			System.out.println("Enter Score - ");
			int score=s.nextInt();
			
			stud[i]=new Student(name,rollNo,age,score);
		}
		
		System.out.println("/////////////////////////////////////////");
		System.out.println("            Student Details");
		System.out.println("/////////////////////////////////////////");
		for(int i=0; i<10; i++)
		{
			System.out.println(stud[i]);
		}
		
		System.out.println("/////////////////////////////////////////");
		System.out.println("    Student Group by Score [0-50] ");
		System.out.println("/////////////////////////////////////////");
		for(int i=0; i<10; i++)
		{
			if(stud[i].getScore()>=0 && stud[i].getScore()<50)
			{
				System.out.println(stud[i]);
			}
		}
		
		System.out.println("/////////////////////////////////////////");
		System.out.println("    Student Group by Score [50-65] ");
		System.out.println("/////////////////////////////////////////");
		for(int i=0; i<10; i++)
		{
			if(stud[i].getScore()>=50 && stud[i].getScore()<65)
			{
				System.out.println(stud[i]);
			}
		}
		
		System.out.println("/////////////////////////////////////////");
		System.out.println("    Student Group by Score [65-80] ");
		System.out.println("/////////////////////////////////////////");
		for(int i=0; i<10; i++)
		{
			if(stud[i].getScore()>=65 && stud[i].getScore()<80)
			{
				System.out.println(stud[i]);
			}
		}
		
		
		System.out.println("/////////////////////////////////////////");
		System.out.println("    Student Group by Score [80-100] ");
		System.out.println("/////////////////////////////////////////");
		for(int i=0; i<10; i++)
		{
			if(stud[i].getScore()>=80 && stud[i].getScore()<100)
			{
				System.out.println(stud[i]);
			}
		}
	    
	}

}
