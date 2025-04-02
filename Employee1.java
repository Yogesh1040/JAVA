
public class Employee1 {
	private String name;
	private int id;
	private Date doj;
	
	public Employee1(String name,int id,Date doj)
	{
		this.name=name;
		this.id=id;
		this.doj=doj;
	}
	public String toString()
	{
		return "Employee ["+name+" "+id+" "+doj+"]";
	}
	public static void main(String[] args) {
		Employee1 e1=new Employee1("Yogesh",101,new Date(12,6,2025));
		System.out.println(e1);
	}

}
