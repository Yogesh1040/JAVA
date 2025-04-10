package p4;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add('Z');
		a.add('C');
		a.add('A');
		a.add('K');
		System.out.println(a);

		a.set(2, 'B');
		System.out.println(a);

		a.remove(2);
		System.out.println(a);

		Collections.sort(a);
		System.out.println(a);

		Collections.sort(a, new MyComparator());
		System.out.println(a);

	}

}
