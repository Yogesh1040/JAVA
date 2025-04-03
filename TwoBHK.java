package assignment2;

public class TwoBHK extends OneBHK{
	
	private int room2area;
		
	public TwoBHK()
	{
		room2area=0;
	}
	public TwoBHK(int rArea,int hArea,int price,int room2area)
	{
		super(rArea,hArea,price);
		this.room2area=room2area;
	}
	
	public void show()
	{
		super.show();
		System.out.println("area of room 2 - "+room2area);
	}
}
