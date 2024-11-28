package day12;

public interface Showable extends Printable {

	void show();

	default public void Sample() {
		System.out.println("default method");

	}

	static void Sample1() {
		System.out.println("default method");

	}

}
