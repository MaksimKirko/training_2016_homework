package h1.task1;

/** 
 * Class prevents type Note with overrided default methods 
 * @author Max
*/
public class Note {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	/*
	 * Constructor with text setting
	 * @param text
	 */
	public Note(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Note [text=" + text + ", hashcode=" + hashCode() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this.hashCode() == obj.hashCode()) {
			return true;
		}
		return false;
	}
	
	
}
