package assignment3;

import java.util.Scanner;

public class XYZ1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Employee1 ep[] = new Employee1[5];
		Employee1 ep1 = null;
		System.out.println("Enter Employee Details : ");
		for (int i = 0; i < ep.length; i++) {
			System.out.println("Enter Employee id : ");
			int empId = s.nextInt();
			System.out.println("Enter Employee Name : ");
			String empName = s.next();
			System.out.println("Enter Employee Salary : ");
			int salary = s.nextInt();

			ep[i] = new Employee1(empId, empName, salary);
			ep1 = ep[i];
			for (int j = 0; j < i; j++) {
				if (ep1.equals(ep[j])) {
					System.out.println("EmpId already exits Enter new Employee ");
					i--;
				}
			}
		}
		System.out.println("---------EMPLOYEE DETAILS---------");
		for (int i = 0; i < ep.length; i++) {
			System.out.println(ep[i]);
		}
	}

}
