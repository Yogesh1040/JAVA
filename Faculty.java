package assignment2;

public class Faculty {
	protected int faculty_id;
	protected float salary;

	public Faculty(int faculty_id) {
		this.faculty_id = faculty_id;
	}

	public void display() {
		System.out.println("Faculty [faculty_id=" + faculty_id + "]");
	}

	public float calSal() {
		return 0.0f;
	}

}
