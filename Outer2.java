package p2;

//Static Inner class   

public class Outer2 
{
	private int a=10;
	private static float f=1.02f;
	public static class Inner
	{
		public void get()
		{
			System.out.println("f- "+f);
		}
	}
	public static void main(String[] args) {
		
		Outer2.Inner i=new Outer2.Inner();
		i.get();
		
	}

}
