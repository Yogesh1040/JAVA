package p3;

import java.util.TreeSet;

public class CompareDemo1 
{
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		System.out.println(t);
		t.add(0);
		System.out.println(t);
		t.add(10);
		System.out.println(t);
		t.add(50);
		System.out.println(t);
	}

}
