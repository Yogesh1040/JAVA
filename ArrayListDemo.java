package p3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo 
{
	public static void main(String[] args) {
		
		List<Integer>a=new ArrayList<Integer>();
		System.out.println(a.isEmpty());
		a.add(10);
		a.add(null);
		a.add(20);
		a.add(20);
		System.out.println(a);
		System.out.println(a.get(3));
		System.out.println(a.size());
		System.out.println(a.contains(10));
			
	}

}

