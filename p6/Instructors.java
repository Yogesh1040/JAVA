package p6;




import java.util.Arrays;
import java.util.List;

public class Instructors {
	
	public static List<Instructor> getAll()
	{
		
		
		Instructor ins1 = new Instructor("Yash", 10, "Software", "M", true, Arrays.asList("Java","Cpp","Python"));
		Instructor ins2 = new Instructor("Priya", 8, "Data Science", "F", true, Arrays.asList("Python", "R", "SQL"));
		Instructor ins3 = new Instructor("Amit", 15, "Web Development", "M", false, Arrays.asList("HTML", "CSS", "JavaScript"));
		Instructor ins4 = new Instructor("Neha", 12, "Cloud Computing", "F", true, Arrays.asList("AWS", "Azure", "Docker"));
		Instructor ins5 = new Instructor("Raj", 9, "Machine Learning", "M", false, Arrays.asList("TensorFlow", "PyTorch", "Scikit-learn"));

		
		List<Instructor> list = Arrays.asList(ins1,ins2,ins3,ins4,ins5);
		return list;
	}

}
