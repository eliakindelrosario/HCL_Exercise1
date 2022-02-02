package eliakin_training;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) throws StudentException {
		//	Create a container to hold students
		List<Student> students = new ArrayList<Student>();
		int numOfStudents = 10;
		int mark = (int)(Math.random() * 120) + 1;
		
		// Add student to list
		for (int i =0; i< numOfStudents; i++) {
			Student student_temp = new Student(i, "Student " + (i+1));
			
			if (mark >= 0 || mark <= 100) {
				student_temp.setStudentMark(mark);
				students.add(student_temp);
		    }else {
		    	throw new StudentException("Mark cannot be 0 < or > 100");  
		    }
		}
		
		//	Test 
		for (int i =0; i< numOfStudents; i++) {
			System.out.println(students.get(i).getStudentName());
		}
		
	}

}
