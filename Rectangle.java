package p1;

public class Rectangle extends Shape
{
	public Rectangle(int len,int br)
	{
		super(len,br);
	}
	public void calArea()
	{
		System.out.println("Area of rectangle - "+len*br);
		
	}
}
