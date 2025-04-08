package p3;

public class Employee implements Comparable
{
	private int empId;
	private String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	@Override
	public int compareTo(Object o)
	{
		Employee e=(Employee)o;
		
		if(this.empId>e.empId)
			return -1;
		if(this.empId<e.empId)
			return 1;
		else 
			return 0;
	}

}
