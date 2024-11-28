package day12;

public class MainCalculator extends NormalCalculator implements ScientificCalculator {

	public static void main(String[] args) {
		MainCalculator obj = new MainCalculator();

		obj.add();
		obj.sub();
		obj.mul();
		obj.cos();
		obj.tan();
	}

	@Override
	public void cos() {

		System.out.println("cos");
	}

	@Override
	public void tan() {
		System.out.println("tan");

	}

}
