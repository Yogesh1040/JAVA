package p2;

//Member Inner class

public class Outer 
{
	private int a=10;
	private class Inner
	{
		private int a=100;
		public void getNo()
		{
			int a=200;
			System.out.println("a- "+a);
			System.out.println("a- "+this.a);
			System.out.println("a- "+Outer.this.a);
		}
	}
	public void get()
	{
		Inner i=new Inner();
		i.getNo();
	}
	
	public static void main(String[] args) {
		Outer o=new Outer();
		Inner i1=o.new Inner();
		i1.getNo();
		
		Inner i=new Outer().new Inner();
		i.getNo();
		o.get();
	}

}
