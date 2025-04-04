package assignment2;

public class CollegeStudent extends Student
{
	private String semester;
	
	public CollegeStudent()
	{
		
	}
	
	public CollegeStudent(int rollNo, float percentage, String semester)
	{
		super(rollNo,percentage);
		this.semester=semester;
	}
	
	@Override
	public void show()
	{
		super.show();
		System.out.print(" [ Semester - "+semester+" ]");
		System.out.println();
	}

}
