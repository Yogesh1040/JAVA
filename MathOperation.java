package assignment1;

public class MathOperation 
{
	private int X;
	private int Y;
	private int R;
	
	public void inIT(int x, int y)
	{
		X=x;
		Y=y;
	}
	
	public int add()
	{
		return R=X+Y;
	}
	
	public int multiply()
	{
		return R=X*Y;
	}
	
	public int power()
	{
		R=1;
		for(int i=1;i<=Y;i++)
		{
			
			R=R*X;
		}
		return R;
	}
	
	public void display()
	{
		System.out.println("Addition = "+add()+"  Multification = "+multiply()+"  Power = "+power());
	}
	
	public static void main(String[] args) {
		MathOperation m = new MathOperation();
		m.inIT(5, 3);
		m.display();
	}
}
