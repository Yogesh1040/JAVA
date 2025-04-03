package p1;

public class Teacher extends Person
{
	private String sub;
	private int years_of_exp;
	
	public void getData()
	{
		super.getData();
		System.out.println("Enter Subject: ");
		sub=s.next();
		System.out.println("Enter No of Experience");
		years_of_exp=s.nextInt();
	}
	
	public void displayData()
	{
		super.displayData();
		System.out.println("[Subject: "+sub+" "+"Year of Experience - "+years_of_exp+"]");
	}
}
