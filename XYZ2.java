package assignment2;

import java.util.Scanner;

public class XYZ2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Student stud[] = new Student[5];
		System.out.println("-------------Enter College Student Details----------");
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter Roll No - ");
			int rollNo = s.nextInt();
			System.out.println("Enter Percentage - ");
			float percentage = s.nextFloat();
			System.out.println("Enter Semester - ");
			String semester = s.next();

			stud[i] = new CollegeStudent(rollNo, percentage, semester);
		}
		System.out.println("-------------Enter School Student Details------------");
		for (int i = 2; i < 5; i++) {
			System.out.println("Enter Roll No - ");
			int rollNo = s.nextInt();
			System.out.println("Enter Percentage - ");
			float percentage = s.nextFloat();
			System.out.println("Enter Class Name - ");
			String className = s.next();
			stud[i] = new SchoolStudent(rollNo, percentage, className);
		}

		System.out.println("-----------------STUDENT DETAILS---------------------");
		for (Student i : stud) {
			i.show();

		}

		System.out.println("\n \n Enter Roll no to serach - ");
		int rnNo = s.nextInt();
		boolean flag = false;
		for (Student st : stud) {
			if (st.rollNo == rnNo) {
				flag = true;
				System.out.println("---------------Student Found-----------------");
				st.show();
				if (st instanceof CollegeStudent) {
					System.out.println("This is a College Student ");
				} else if (st instanceof SchoolStudent) {
					System.out.println("This is a School Student ");
				}
				break;
			}

		}
		if (flag == false) {
			System.out.println("--------------Student not found-------------- ");
		}

		System.out.println("----------------Students Having Grade A---------------- ");

		flag = false;
		for (Student gr : stud) {
			if (gr.percentage > 75.00) {
				flag = true;
				gr.show();
			}

		}
		if (flag == false) {
			System.out.println("-------------------NONE----------------------");
		}

	}

}
