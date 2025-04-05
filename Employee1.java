package assignment3;

public class Employee1 
{
	protected int empId;
	private String empName;
	private int salary;
	
	public Employee1(int empId, String empName, int salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	@Override
	public String toString()
	{
		return "Employee [ Id - "+empId+" Name -"+empName+" Salary - "+salary+" ]";
	}
	
	@Override
	public boolean equals(Object ob)
	{
		Employee1 e=(Employee1)ob;
		if(this.empId==e.empId)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
