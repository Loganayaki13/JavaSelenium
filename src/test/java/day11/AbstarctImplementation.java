package day11;

public class AbstarctImplementation extends AbstractCalc {

	public void add() {
		System.out.println("Addition");

	}

	public void sub() {
		System.out.println("Subtraction");

	}

	public static void main(String[] args) {

		AbstarctImplementation obj = new AbstarctImplementation();
		obj.add();
		obj.sub();
		obj.mul();

	}

}
