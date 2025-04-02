import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of student");
		int size = s.nextInt();
		Student stud[]=new Student[size];
		System.out.println("Enter student details..");
		for(int i=0;i<stud.length;i++)
		{
			System.out.println("Enter Details of student "+(i+1)+" - ");
			System.out.println("Enter rollno - ");
			int rno=s.nextInt();
			System.out.println("Enter name  - ");
			String name = s.next();
			System.out.println("Enter marks1 - ");
			int m1=s.nextInt();
			System.out.println("Enter marks2 - ");
			int m2=s.nextInt();
			System.out.println("Enter marks3 - ");
			int m3=s.nextInt();
			
			stud[i]=new Student(rno,name,m1,m2,m3);
		}
		System.out.println("----------STUDENT DETAILS-------------");
		for(int i=0;i<stud.length;i++)
		{
			System.out.println(stud[i]);
		}
	}

}
