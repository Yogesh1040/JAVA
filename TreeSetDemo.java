package p3;

import java.util.TreeSet;

public class TreeSetDemo 
{
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		//t.add(null);//NullPointerException
		t.add(10);
	//	t.add('a');//ClassCastException
		t.add(10);
		System.out.println(t);
	}

}
