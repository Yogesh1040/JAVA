public class SimpleInterest 
{
	private float prin;
	private float inte;
	private float time;
	
	public void setValue()
	{
		prin=1523.6f;
		inte=7.8f;
		time=1.5f;
	}
	public float SI()
	{
		float Total;
		Total=(float)(prin*(1+(inte*time)));
		return Total;
	}
	public void display()
	{
		System.out.println("Total Simple interest is "+SI());
	}
	public static void main(String args[])
	{
		SimpleInterest s=new SimpleInterest();
		s.setValue();
		s.SI();
		s.display();
	}

}
