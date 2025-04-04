package assignment2;

import java.util.Scanner;

public class XYZ 
{
	public static void main(String[] args) {
		OneBHK arr[]=new OneBHK[3];
		Scanner s=new  Scanner(System.in);
		System.out.println("Enter Details");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter room1 area: ");
			int rArea=s.nextInt();
			System.out.println("Enter room2 area: ");
			int room2area=s.nextInt();
			System.out.println("Enter hall area: ");
			int hArea=s.nextInt();
			System.out.println("Enter Price : ");
			int price=s.nextInt();
			
			arr[i]=new TwoBHK(rArea,hArea,price,room2area);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("-----------Flat "+(i+1));
			arr[i].show();
		}
		
		System.out.println("total no of flats: "+arr.length);
				
	}
}
