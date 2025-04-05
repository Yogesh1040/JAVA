package assignment3;

public class Employee implements Taxable
{
	private int empId;
	private String empName;
	private int salary;
	
	public Employee(int empId, String empName, int salary) 
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		
	}

	@Override
	public void calTax()
	{
		System.out.println("Income Tax on Yearly Salary is "+(float)12*salary*incomeTax);
	}

}
