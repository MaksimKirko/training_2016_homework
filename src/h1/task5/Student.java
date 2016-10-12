package h1.task5;

import java.util.ArrayList;
import java.util.List;

import h1.task5.subjects.Subject;

public class Student {
	private String name;
	private List<Subject> subjects;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public Student(String name) {
		this.name = name;
		subjects = new ArrayList<Subject>();
	}
	
	public void getMarks() {
		for (Subject subject : subjects) {
			System.out.println(subject.toString());
		}
	}
	
	public void addSubjects(Subject... subjects) {
		for (Subject subject : subjects) {
			this.subjects.add(subject);
		}	
	}
}