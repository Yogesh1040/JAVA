package p2;

public class Demo1 
{
	public static void main(String[] args) {
		
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("c- "+c);
		}
		
		  catch(ArrayIndexOutOfBoundsException e) { System.out.println(e);
		  System.out.println("Enter two parameters"); } catch(NumberFormatException e)
		  { System.out.println(e); System.out.println("Enter only integer values"); }
		  catch(ArithmeticException e) { System.out.println(e);
		  System.out.println("Cannot devide by zero"); }
		 
		/*catch(Exception e)
		{
			if(e instanceof ArithmeticException)
			{
				System.out.println(e);
			}
			else if(e instanceof NumberFormatException)
			{
				System.out.println(e.getMessage());
			}
			else if(e instanceof ArrayIndexOutOfBoundsException)
			{
				e.printStackTrace();
			}
			else
			{
				System.out.println("Exception Occurred");
			}
		}*/
	}

}
