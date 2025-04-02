package assignment1;
import java.util.Scanner;
public class Days 
{
	private int days;
	private int day;
	private int month;
	private int year;
	
	public void inIt(int days)
	{
		this.days=days;
	}
	
	public void cal()
	{
		year=days/365;
		days=days%365;
		month=days/30;
		day=days%30;
		
		System.out.println("Year - "+year+" Month - "+month+" Day - "+day);
	}
	
	public static void main(String[] args) {
		Days d = new Days();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total days : ");
		int days=s.nextInt();
		d.inIt(days);
		d.cal();	
	}

}
