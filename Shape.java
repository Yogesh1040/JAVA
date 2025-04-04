package p1;

public abstract class Shape 
{ 
	protected int rad;
	protected int len,br;
	
	public Shape(int rad)
	{
		this.rad=rad;
	}
	
	public Shape(int len,int br)
	{
		this.len=len;
		this.br=br;
	}
	
	public abstract void calArea();
}
