package assignment3;

import java.util.Scanner;

public class XYZ 
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee Details :");
		System.out.println("Enter Employee id : ");
		int empId=s.nextInt();
		System.out.println("Enter Employee name : ");
		String empName=s.next();
		System.out.println("Enter Employee Salary : ");
		int salary=s.nextInt();
		System.out.println("Enter Product Details :");
		System.out.println("Enter Product id : ");
		int pid=s.nextInt();
		System.out.println("Enter Product Price : ");
		float price=s.nextFloat();
		System.out.println("Enter Product Quantity :");
		int quantity=s.nextInt();
		
		Taxable e=new Employee(empId,empName,salary);
		Taxable p=new Product(pid,price,quantity);
		
		e.calTax();
		p.calTax();
	}

}
