
public class Date 
{
	private int dd,mm,yy,i;
	private Date d[];
	
	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public Date(int i)
	{
		d=new Date[i];
	}
	public String toString()
	{
		return "Date["+dd+"/"+mm+"/"+yy+"]";
	}
	public static void swapDate(Date d[])
	{
		Date temp;
		temp =d[0];
		d[0]=d[1];
		d[1]=temp;
	}
	
	public static void main(String[] args) {
		Date d[]=new Date[2];
		Date d1 = new Date(2,5,2104);
		Date d2 = new Date(5,4,2024);
		d[0]=d1;
		d[1]=d2;
		System.out.println("----------Before swapping ------------- ");
		System.out.println(d[0]+"   "+d[1]);
		Date.swapDate(d);
		System.out.println("----------After swaping---------------");
		System.out.println(d[0]+"   "+d[1]);
	}
}
