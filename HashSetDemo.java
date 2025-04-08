package p3;

import java.util.HashSet;

public class HashSetDemo 
{
	public static void main(String[] args) {
		
		HashSet h= new HashSet();
		h.add(10);
		h.add('A');
		h.add(10.2);
		h.add(10);
		h.add(null);
		System.out.println(h.add(null));
		System.out.println(h);
	}

}
