package p2;

public class A extends Coffee
{
	@Override
	public void taste()
	{
		System.out.println("AA");
	}
	
	public static void main(String[] args) {
		
		Coffee c=new A();
		c.taste();
		System.out.println(c.getClass());
	}

}
