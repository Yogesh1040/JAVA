package assignment2;

public class PartTimeFaculty extends Faculty {
	private int hour, rate;

	public PartTimeFaculty(int faculty_id, int hour, int rate) {
		super(faculty_id);
		this.hour = hour;
		this.rate = rate;
	}

	@Override
	public float calSal() {
		float sal = hour * rate;
		return sal;
	}

	public void display() {
		super.display();
		System.out.println("[ Hour - " + hour + " Rate - " + rate + " Salary - " + calSal() + " ]");
	}

}
