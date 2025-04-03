package assignment1;
import java.util.Scanner;
public class XYZ 
{
	
	public float totalAmt(Product pro[])
	{
		float total=0;
		for(int i=0;i<5;i++)
		{
			total=total+(pro[i].getPrice()*pro[i].getQuantity());
		}
		return total;
	}
	public static float highestPrice(Product pro[])
	{
		float h=0.0f;
		for(int i=0;i<5;i++)
		{
			if(h<pro[i].getPrice())
				h=pro[i].getPrice();
		}
		return h;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Five product details");
		Product pro[]= new Product[5];
		XYZ x=new XYZ();
		for(int i=0;i<pro.length;i++)
		{
			System.out.println("Enter product id : ");
			int pid=s.nextInt();
			System.out.println("Enter product price : ");
			float price=s.nextFloat();
			System.out.println("Enter product quantity : ");
			int quantity=s.nextInt();
			
			pro[i]=new Product(pid,price,quantity);
		}
		
		
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println(pro[i] );
			
		}
		System.out.println("Higest price ["+highestPrice(pro)+"]");
		System.out.println("Total - "+x.totalAmt(pro));
	}
}
	