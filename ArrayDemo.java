package p3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayDemo 
{
	public static void main(String[] args) {
		
		List<Integer> i=new ArrayList<Integer>();
		i.add(10);
		i.add(20);
		i.add(78);
		i.add(3);
		i.add(4);
		ListIterator<Integer> itr=i.listIterator();
		while(itr.hasNext())
		{
			int a=itr.next();
			if(a==3)
			{
				itr.set(11);
				System.out.println(i);
				itr.remove();
				System.out.println(i);
				itr.add(13);
			}
		}System.out.println(i);
	}

}
