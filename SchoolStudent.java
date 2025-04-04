package assignment2;

public class SchoolStudent extends Student
{
	private String className;
	
	public SchoolStudent()
	{
		
	}
	
	public SchoolStudent(int rollNo, float percentage, String className)
	{
		super(rollNo, percentage);
		this.className=className;
	}
	
	@Override
	public void show()
	{
		super.show();
		System.out.print(" [ Class Name - "+className+" ]");
		System.out.println();
	}

}
