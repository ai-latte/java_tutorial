package kh.java.func;

public class GenericeEx<T> {
	
	private T date;

	public GenericeEx(T date) {
		super();
		this.date = date;
	}

	public GenericeEx() {
		super();
	}
	
	public T getDate() {
		return date;
	}

	public void setDate(T date) {
		this.date = date;
	}

}
