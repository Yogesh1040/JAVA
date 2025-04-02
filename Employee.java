package assignment1;

public class Employee 
{
	private int empNo;
	private int sal;
	private static int totalSal;
	private static int cnt;
	
	public Employee(int s)
	{
		
		sal=s;
		cnt++;
		empNo=cnt;
		totalSal+=sal;
		
	}
	public String toString()
	{
		return "Employee id - "+empNo+" Salary = "+sal;
	}
	
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee(12000);
		Employee e2 = new Employee(12000);
		Employee e3 = new Employee(12000);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("Total employee count = "+Employee.cnt);
		System.out.println("Total salary = "+Employee.totalSal);
	}

}
