package p6;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {

		List<Instructor> list = Instructors.getAll();
		System.out.println("-------------------------------------------------------------");
		Consumer<Instructor> c = (x) -> {
			System.out.println(x);
		};
		list.forEach(c);
		System.out.println("-------------------------------------------------------------");
		// Consumer<Instructor> c1 = (x) -> {System.out.println(x.getName());};
		// list.forEach(c1);
		list.forEach((x) -> {
			System.out.println(x.getName());
		});
		System.out.println("-------------------------------------------------------------");
		list.forEach((x) -> {
			System.out.println(x.getName());
			System.out.println(x.getYearOfExp());
		});
		System.out.println("-------------------------------------------------------------");
		list.forEach((x) -> {
			if (x.isOnlinCourse()) {
				System.out.println(x.getName());
			}
		});
		System.out.println("-------------------------------------------------------------");
		list.forEach((x) -> { 
			if(x.getYearOfExp()>10) {
				System.out.println(x.getName());
				}
		});
		System.out.println("-------------------------------------------------------------");
		list.forEach((x) -> { if (x.isOnlinCourse()  && x.getYearOfExp()>10) {
			System.out.println(x.getName());
		}
		});
		System.out.println("-------------------------------------------------------------");
		
	}
}
