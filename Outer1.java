package p2;

//Method Local Inner class

public class Outer1 
{
	private static int b=10;
	private static float f=10.3f;
	public static void get()
	{
		int a=100;
		 class Inner
		{
			private int a=20;
			public void display()
			{
				System.out.println("a- "+a);
				System.out.println("a- "+Outer1.b);
				System.out.println("f- "+f);
			}
		}
		Inner i=new Inner();
		i.display();
	}
	
	public static void main(String[] args) {
		Outer1 o= new Outer1();
		o.get();
	}

}
