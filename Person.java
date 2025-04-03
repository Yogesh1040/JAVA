package p1;
import java.util.Scanner;
public class Person {
	
	protected String fname;
	protected String lname;
	protected int age;
	
	public Scanner s = new Scanner(System.in);
	
	public void getData()
	{
		System.out.println("Enter first name: ");
		fname=s.next();
		System.out.println("Enter last name: ");
		lname=s.next();
		System.out.println("Enter age: ");
		age=s.nextInt();
	}
	
	public void displayData()
	{
		System.out.println("["+"Name: "+fname+" "+lname+" "+"age: "+age+"]");
	}

}
