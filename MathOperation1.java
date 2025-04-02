package assignment1;


public class MathOperation1 
{
	private int x,y;
	private float a,b,c;
	private double db;
	private int arr[];
	
	public void multiply(int x, int y)
	{
		System.out.println("Multiplication (int,int)= "+x*y);
	}
	
	public void multiply(float a, float b, float c)
	{
		System.out.println("Multiplication (float,float,float) = "+a*b*c);
	}
	public void multiply(double db, int x)
	{
		System.out.println("Multiplications (double,int) = "+db*x);
	}
	public void multiply(int arr[])
	{
		int sum=1;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum*arr[i];
		}
		System.out.println("Array mul = "+sum);
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		MathOperation1 m =new MathOperation1();
		m.multiply(arr);
		m.multiply(3,4);
		m.multiply(5.2f,5.6f,5.3f);
		m.multiply(5.25d,5);
		
	}

}
