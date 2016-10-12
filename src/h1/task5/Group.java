package h1.task5;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Group() {
		students = new ArrayList<Student>();
	}
	
	public void showStudents() {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
	
	public Student findStudentByName(String name) {
		for (Student student : students) {
			if(student.getName().equals(name)) {
				return student;
			}
		}
		
		return null;
	}
	
	public void addStudents(Student... students) {
		for (Student student : students) {
			this.students.add(student);
		}
	}
}