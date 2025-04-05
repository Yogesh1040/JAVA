package assignment3;

public class Factorial extends Processor
{
	int fact=1;
	@Override
	public void process()
	{
		
		for(int i=1; i<=data; i++)
		{
			fact*=i;
		}
		
	}
	@Override
	public void showData()
	{
		System.out.println("Factorial of "+data+" is "+fact);
	}

}
