package p3;

import java.util.TreeSet;

public class Test1 
{
	public static void main(String[] args) {
		

		Employee e1=new Employee(100,"Rahul");
		Employee e2=new Employee(200,"Rahu");
		Employee e3=new Employee(300,"Yash");
		Employee e4=new Employee(400,"Yash");
		Employee e5=new Employee(500,"Rahul");
		Employee e6=new Employee(600,"Rahul");
		
		TreeSet<Employee> t=new TreeSet<Employee>(new MyComparator1());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		
		System.out.println(t);
		
	}

}
