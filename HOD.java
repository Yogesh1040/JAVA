package p1;

public class HOD extends Teacher
{
	private String dept;
	
	public void getData()
	{
		super.getData();
		System.out.println("Enter Department: ");
		dept=s.next();
	}
	
	public void displayData()
	{
		super.displayData();
		System.out.println("[Department: "+dept+"]");
	}
}
