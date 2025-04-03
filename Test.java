package assignment1;

import java.util.Scanner;

public class Test 
{
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter length of Tile - ");
		float tilelength=s.nextFloat();
		
		Tile t=new Tile(tilelength);
		
		
		System.out.println("Enter length and width of Floor - ");
		float floorlen=s.nextFloat();
		float floorwid=s.nextFloat();
		
		Floor f=new Floor(floorlen,floorwid);
		
		f.totalTiles(t);
		
		
	}

}
