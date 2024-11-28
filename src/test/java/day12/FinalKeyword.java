package day12;

public class FinalKeyword {

	final int a = 10;
	int b=20;
	int result;

	/*
	 * //Methods: A final method cannot be overriden. //Classes: A final class
	 * cannot be extended or inherited by another child class
	 */
	public final void add() {

		System.out.println("Final method");
	}

	public int addition() {
		
		result=a+b;
		System.out.println("Addition : "+result);
		return result;
		

	}

	public static void main(String[] args) {

		FinalKeyword obj = new FinalKeyword();
		// obj.a = 20;
		obj.add();
		obj.addition();

	}
}
