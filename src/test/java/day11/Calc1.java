package day11;

public class Calc1 {
	int num1;
	int num2;
	int result;

	public void add() {

		result= num1 + num2;	
		System.out.println("Add value: " + result);
		
	}
	
	public void add(int num3) // method overloading
	{

		result= num1 + num2+num3;	
		System.out.println("Add with 3 values:  " + result);
		
	}

	public void sub() {

		result = num1 - num2;
		System.out.println("Sub value: " + result);
	}

	public void mul() {

		result = num1 * num2;
		System.out.println("Mul value: " + result);
	}

	public void div() {

		result = num1 / num2;
		System.out.println("Div value: " + result);
	}

}
