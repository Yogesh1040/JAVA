package assignment2;

public class OneBHK 
{
	private int rArea;
	private int hArea;
	private int price;
	
	public OneBHK()
	{
		rArea=0;
		hArea=0;
		price=0;		
	}
	public OneBHK(int rArea,int hArea,int price)
	{
		this.rArea=rArea;
		this.hArea=hArea;
		this.price=price;
	}
	
	public void show()
	{
		System.out.println("area of room 1 = "+rArea);
		System.out.println("area of hall = "+hArea);
		System.out.println("Price = "+price);
	}
}
