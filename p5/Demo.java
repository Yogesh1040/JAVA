package p5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo extends Thread
{
	static ArrayList<Integer> a = new ArrayList<Integer>();
	static List<Integer> list = Collections.synchronizedList(a);
	
	public void run()
	{
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(("Child thread updating"));
		list.add(10);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		list.add(20);
		list.add(30);
		list.add(40);
		Demo d = new Demo();
		d.start();
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext())
		{
			int i = itr.next();
			Thread.currentThread().sleep(3000);
			System.out.println("Main thread");
		}
		System.out.println(list);
	}

}
