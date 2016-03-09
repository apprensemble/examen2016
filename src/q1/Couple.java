package q1;

import java.io.Serializable;

public class Couple<T, U> implements Serializable {
	private T first;
	private U second;

	public Couple(T first, U second) {
		super();
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public U getSecond() {
		return second;
	}

	public String toString() {
		return "(" + first + "," + second + ")";
	}
}
