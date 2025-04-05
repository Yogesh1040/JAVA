package p2;

//Anonymous Inner class

public class Test extends Outer
{
	public static void main(String[] args) {
		
		Coffee c=new Coffee(){
			@Override
			public void taste()
			{
				System.out.println("Sweet");
			}
		};
		c.taste();
		System.out.println(c.getClass());
	}

}
