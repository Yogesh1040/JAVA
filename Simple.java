public class Simple {
	
	public static void main(String[] args) 
	{
		if(args.length==3)
		{
			long p=Long.parseLong(args[0]);
			int y=Integer.parseInt(args[1]);
			float r=Float.parseFloat(args[2]);
			
			double si=p*y*r/100;
			
			System.out.println("Simple Interest  -  "+si);
		}
		else
		{
			System.out.println("Invalid ....");
		}
	}

}
