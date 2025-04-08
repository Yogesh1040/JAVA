package p3;

import java.util.Arrays;
import java.util.List;

public class Test 
{
	public static void getSum(List<? extends Number> i)
	{
		System.out.println(i);
		int a=0;
		for(Number n:i)
		{
			Integer sum=(Integer)n;
			a+=sum;
		}
		System.out.println("Sum - "+a);
	}
	
	public static void main(String[] args) {
		
		List<Integer> i=Arrays.asList(1,2,3,4,5,6);
		Test.getSum(i);
				
	}

}
