package assignment3;

public class Circle extends Processor
{
	private float area; 
	@Override
	public void process()
	{
		area=(float)3.14*data*data;
		
	}
	@Override
	public void showData()
	{
		System.out.println("Area of Cirlce having radius "+data+" is "+area);
	}

}
