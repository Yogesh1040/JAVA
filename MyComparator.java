package p4;

import java.util.Comparator;


public class MyComparator implements Comparator<Character>
{
	@Override
	public int compare(Character o1,Character o2)
	{
		if(o1>o2)
		{
			return -1;
		}
		if(o1<o2)
		{
			return 1;
		}
		else
			return 0;
	}

}
