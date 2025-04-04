package assignment2;

import java.util.Scanner;

public class XYZ1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Faculty fac[] = new Faculty[4];
		System.out.println("Enter Full Time Faculty Details - ");
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter Faculty id - ");
			int faculty_id = s.nextInt();
			System.out.println("Enter Basic  - ");
			int basic = s.nextInt();
			System.out.println("Enter Allowance - ");
			int allowance = s.nextInt();

			fac[i] = new FullTimeFaculty(faculty_id, basic, allowance);
		}

		System.out.println("Enter Part Time Faculty Details - ");
		for (int i = 2; i < 4; i++) {
			System.out.println("Enter Faculty id - ");
			int faculty_id = s.nextInt();
			System.out.println("Enter Hours  - ");
			int hour = s.nextInt();
			System.out.println("Enter Rate - ");
			int rate = s.nextInt();

			fac[i] = new FullTimeFaculty(faculty_id, hour, rate);
		}

		for (int i = 0; i < 4; i++) {
			fac[i].calSal();
			fac[i].display();
		}
	}

}
