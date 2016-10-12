package h1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import h1.task1.*;
import h1.task234.*;
import h1.task234.comparators.*;
import h1.task234.models.*;
import h1.task5.*;
import h1.task5.subjects.*;
import h1.task5.subjects.Math;
import h1.task67.NuclearMarine;

public class Program {
	public static void main(String[] args) {
		/*
		 * task 1
		 */

		// Notepad notepad = new Notepad();
		// Random rand = new Random();
		// for(int i = 0; i < 10; i++) {
		// Note note = new Note(rand.nextInt() + "asdjgas");
		// notepad.addNote(note);
		// }
		//
		// notepad.printNotes();

		/*
		 * tasks 2-4
		 */

		// Employee emp = new Employee("Andrey");
		// Employee emp2 = new Employee("Ivan");
		//
		// emp.addStationery(new Pen("Erich Krause"), new Stapler("Daster"));
		// emp2.addStationery(new Pen("Centrum"));
		//
		// emp.showStationeries();
		// emp2.showStationeries();

		// NewbieSet ns = new NewbieSet();
		// ns.addStationery(new Pen("Centrum"), new Pen("Erich Krause"), new
		// Stapler("Daster"));
		// Comparator<Stationery> sComp = new CostComparator().thenComparing(new
		// BrandComparator());
		//
		// Collections.sort(ns.getStationeries(), sComp);
		// ns.showStationeries();

		/*
		 * task 5
		 */
		
		// Student student = new Student("Andrew");
		// student.addSubjects(new Math(), new Biology(), new Chemistry());
		//
		// Student student2 = new Student("Ivan");
		// student2.addSubjects(new Math(), new Biology());
		//
		//
		// Group group = new Group();
		// group.addStudents(student, student2);
		// group.findStudentByName("Andrew").getMarks();
		
		/*
		 * tasks 6-7
		 */
		//NuclearMarine marine = new NuclearMarine("Megalodon", 70, 27);
	}
}
