
public class Mydate 
{
	
	    private int dd;
		private int mm;
		private int yyyy;
		
		public void setValue()
		{
			dd=31;
			mm=3;
			yyyy=2025;
		}
		
		public void display()
		{
			System.out.println(" Today's Date is "+dd+"/"+mm+"/"+yyyy);
		}
		
		public static void main(String args[])
		{
			Mydate d=new Mydate();
			d.setValue();
			d.display();		

		}

}
