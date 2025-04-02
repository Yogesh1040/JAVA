import java.util.Scanner;

public class Array2D {
	private int arr[][];
	private int  size1,size2;

	public Array2D(int size1, int size2) 
	{
        this.size1 = size1;
        this.size2 = size2;
        arr = new int[size1][size2];
    }
	
	public void getElements()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("----------------Enter Array elements--------------------- ");
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				System.out.println("Enter Elements ["+i+"] ["+j+"] -- ");
				arr[i][j]=s1.nextInt();
			}
		}
	}
	
	public void displayElements()
	{
		System.out.println("-------------------Array Elements are------------------");
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Size of 2D array");
		Scanner s = new Scanner(System.in);
		int size1=s.nextInt();
		int size2=s.nextInt();
		
		int arr[][]=new int[size1][size2];
		
		Array2D a=new Array2D(size1,size2);
		
		a.getElements();
		a.displayElements();
	}
}
