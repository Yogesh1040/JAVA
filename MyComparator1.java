package p3;

import java.util.Comparator;

public class MyComparator1 implements Comparator<Employee>
{
	@Override
	public int compare(Employee o,Employee o1)
	{
		String s=o.getEmpName();
		String s1=o1.getEmpName();
		
		return s.compareTo(s1);
	}

}
