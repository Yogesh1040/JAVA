package p1;

public class Employee {
	public int empid;
	public String empname;
	
	public Employee()
	{
		empid=101;
		empname="prasad";
	}
	public Employee(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
	public boolean equals(Object ob)
	{
		Employee e=(Employee)ob;
		if((this.empid==e.empid) && (this.empname.equals(e.empname)))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		return this.empid+1;
	}
	
	
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Prasad");
		Employee e2=new Employee(101,"Prasad");
		
		if(e1==e2)
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		if(e1.equals(e2))
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
	
	
		
}
