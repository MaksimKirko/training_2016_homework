package h1.task1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Class prevents type Notepad with abilities to add, edit and delete notes
 * @author Max
*/
public class Notepad {
	private List<Note> notes;

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	/*
	 * Empty constructor
	 */
	public Notepad() {
		notes = new ArrayList<Note>();
	}
	
	/*
	 * Add note
	 * @param note
	 */
	public void addNote(Note note) {
		notes.add(note);
	}
	
	/*
	 * Edit chosen Note
	 * @param oldNote
	 * @param newNote
	 */
	public void editNote(Note oldNote, Note newNote) {
		for(Note n : notes) {
			if(n.equals(oldNote)) {
				n = newNote;
				return;
			}
		}
	}
	
	/*
	 * Delete chosen note
	 * @param note
	 */
	public void deleteNote(Note note) {
		for(Note n : notes) {
			if(n.equals(note)) {
				notes.remove(n);
				return;
			}
		}
	}
	
	/*
	 * Print all notes to console
	 */
	public void printNotes() {
		for(Note n : notes) {
			System.out.println(n.toString());
		}
	}
}
