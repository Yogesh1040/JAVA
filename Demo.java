package p3;

import java.util.ArrayList;

public class Demo 
{
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add(10);
		System.out.println(a);
		System.out.println(a.add(20));
		a.add("abc");
		a.add(10);
		for(Object p:a)
		{
			System.out.println(p);
		}
		
		String str=(String)a.get(0);
	}

}
