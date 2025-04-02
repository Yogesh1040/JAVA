public class Subject 
{
	private int chem;
	private int phy;
	private int maths;
	private int his;
	private int geo;
	
	public void setMarks()
	{
		chem=52;
		phy=59;
		maths=84;
		his=89;
		geo=90;
	}
	
	public float calPer()
	{
		return (chem+phy+maths+his+geo)/5;
	}
	
	public void display()
	{
		System.out.println("The total percentage is "+calPer());
	}
	
	public static void main(String args[])
	{
		Subject s=new Subject();
		s.setMarks();
		s.calPer();
		s.display();
	}

}
