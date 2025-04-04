package assignment2;

public class FullTimeFaculty extends Faculty {
	protected int basic;
	protected int allowance;

	public FullTimeFaculty(int faculty_id, int basic, int allowance) {
		super(faculty_id);
		this.basic = basic;
		this.allowance = allowance;
	}

	@Override
	public float calSal() {
		float sal = basic + allowance;
		return sal;
	}

	public void display() {
		super.display();
		System.out.println("[ Basic - " + basic + " Allowance - " + allowance + " Salary - " + calSal() + " ]");
	}

}
