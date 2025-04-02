import java.util.Scanner;

public class Array1D 
{
	private int arr[];
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size=s.nextInt();
		int arr[]=new int[size];
		
		System.out.println("----------Enter the Array elements-------------  ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("-----------Array Elements are -------------");
	/*	for(int i=0;i<size;i++)
		{
			System.out.println("Array element ["+i+"] is "+arr[i]);
		} */
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
