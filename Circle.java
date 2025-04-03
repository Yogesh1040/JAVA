package p1;

public class Circle extends Shape
{ 
	public Circle(int rad)
	{
		super(rad);
	}
	public void calArea()
	{
		float Area=(float)3.14*rad*rad;
		System.out.println("Area of circle - "+Area);
	}
}
