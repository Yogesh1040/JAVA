package p6;

import java.util.List;

public class Instructor 
{
	String name;
	int yearOfExp;
	String title, gender;
	boolean onlinCourse;
	List<String> courses;
		
	public Instructor(String name, int yearOfExp, String title, String gender, boolean onlinCourse,
			List<String> list) {
		super();
		this.name = name;
		this.yearOfExp = yearOfExp;
		this.title = title;
		this.gender = gender;
		this.onlinCourse = onlinCourse;
		this.courses = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfExp() {
		return yearOfExp;
	}
	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isOnlinCourse() {
		return onlinCourse;
	}
	public void setOnlinCourse(boolean onlinCourse) {
		this.onlinCourse = onlinCourse;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Instructor [name=" + name + ", yearOfExp=" + yearOfExp + ", title=" + title + ", gender=" + gender
				+ ", onlinCourse=" + onlinCourse + ", courses=" + courses + "]";
	}
	
	

}
