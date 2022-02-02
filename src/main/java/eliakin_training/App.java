package eliakin_training;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//	Create a container to hold students
		List<Student> students = new ArrayList<Student>();
		int numOfStudents = 10;
		
		// Add student to list
		for (int i =0; i< numOfStudents; i++) {
			students.add(new Student(i, "Student " + (i+1)));
		}
		
		System.out.println(students.get(1).getStudentName());
		
	}

}
