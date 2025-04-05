package assignment3;

public abstract class Processor 
{
	protected int data;
	public void showData()
	{
		System.out.println("Data - "+data);
	}
	public abstract void process(); 

}
