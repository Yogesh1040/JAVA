package p1;

public final class Immutable {
	public final int rollno;
	public final String name;
	
	public Immutable()
	{
		rollno=1;
		name="pawan";
	}
	
	public Immutable(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	public int getno()
	{
		return rollno;
	}
	
	public String getname()
	{
		return name;
	}
	
	public static void main(String[] args) {
		Immutable s=new Immutable(1,"pawan");
		//s.rollno=100;
	}
	

}
