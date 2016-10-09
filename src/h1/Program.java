package h1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import h1.task1.*;
import h1.task234.*;
import h1.task234.comparators.*;
import h1.task234.models.*;

public class Program {
	public static void main(String[] args) {
		/*
		 * task 1
		 */
		
//		Notepad notepad = new Notepad();
//		Random rand = new Random();
//		for(int i = 0; i < 10; i++) {
//			Note note = new Note(rand.nextInt() + "asdjgas");
//			notepad.addNote(note);
//		}
//		
//		notepad.printNotes();
		
		/*
		 * tasks 2-4
		 */
		
//		Employee emp = new Employee("Andrey");
//		Employee emp2 = new Employee("Ivan");
//		
//		emp.addStationery(new Pen("Erich Krause"), new Stapler("Daster"));
//		emp2.addStationery(new Pen("Centrum"));
//		
//		emp.showStationeries();
//		emp2.showStationeries();
		
		NewbieSet ns = new NewbieSet();
		ns.addStationery(new Pen("Centrum"), new Pen("Erich Krause"), new Stapler("Daster"));
		Comparator<Stationery> sComp = new CostComparator().thenComparing(new BrandComparator());
		
		Collections.sort(ns.getStationeries(), sComp);
		ns.showStationeries();
	}	
}
