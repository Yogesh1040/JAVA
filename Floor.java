package assignment1;

public class Floor 
{
	private float length,width;
	
	public Floor(float length, float width)
	{
		this.length=length;
		this.width=width;
	}
	public float floorArea()
	{
		return length*width;
	}
	public void totalTiles(Tile t)
	{
		float total=(floorArea()/t.tileArea());
		System.out.println("Total tiles - "+total);
	}

}

