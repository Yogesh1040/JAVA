package assignment1;

public class Person 
{
	private int age =18;
	private String name;
	
	public Person()
	{
		age=18;
		
	}
	public Person(String nm)
	{
		age=18;
		name=nm;
	}
	public Person(String nm,int a)
	{
		name=nm;
		age=a;
	}
	public void display()
	{
		System.out.println("Name - "+name+" Age - "+age);
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		Person p1= new Person("Yash");
		Person p2= new Person("Yash",34);
		p.display();
		p1.display();
		p2.display();
	}

}
