package h1.task5.subjects;

import java.util.List;

public abstract class Subject<T extends Number> {
	private T mark;

	public T getMark() {
		return mark;
	}

	public void setMark(T mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Subject [mark=" + mark + "]";
	}
}
