package p1;

public class B extends A 
{
	private int a;
	public B()
	{
		a=100;
	}
	
	protected void getNo()
	{
		System.out.println("a - "+a);
	}
	public void m()
	{
		System.out.println("mmm");
	}
	public static void main(String[] args) {
	// A b=new B();
	 // b.getNo();
		
		A a=new B();
	    ((B)a).m();
	}

}
