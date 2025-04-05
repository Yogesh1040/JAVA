package p2;

public class Demo 
{
	public void get()
	{
		msg();
	}
	public void msg()
	{
		int a=10/0;
		System.out.println("a "+a);
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.get();
	}

}
