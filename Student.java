package assignment2;

public class Student 
{
	protected int rollNo;
	protected float percentage;
	
	public Student()
	{
		
	}
	public Student(int rollNo, float percentage) {
		super();
		this.rollNo = rollNo;
		this.percentage = percentage;
	}
	
	public void show()
	{
		System.out.println(" Student [ Roll No - "+rollNo+" Percentage - "+percentage+" ]");
	}
	

}
