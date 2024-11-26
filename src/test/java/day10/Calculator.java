package day10;

import java.util.Scanner;

public class Calculator {

	// variables

	int num1; // Instance variables ->These variables are accessible within the entire class,
				// and can be accessed by any method or constructor.
	int num2;
	int result;

	static int num3;
	static int num4;
	static int res;

	
	// creating methods

	public int add() {
		result = num1 + num2;
		// System.out.println("Addition values is : " + result);
		return result;

	}

	public int sub() {
		result = num1 - num2;
		 //System.out.println("Subtraction values is : " + result);
		return result;

	}

	// creating static method- no need object to call we can directly inside main
	// method without object instead we can call using class name
	public static void mul() {
		res = num3 * num4;
		//System.out.println("Multiplication value is :" + res);
	}

	public void div(int num1, int num2) // Local variables ->These variables are only accessible within the block of
										// code or method where they are declared.
	{
		this.num1 = num1;
		this.num2 = num2;
		result = num1 / num2;
		System.out.println("Division value is : " + result);
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		
		Scanner sc = new Scanner(System.in);// Reading the value from console and storing in the variable
		
			
		  System.out.println("Enter the value for num1: ");
		  obj.num1 = sc.nextInt();
		  System.out.println("Enter the value for num2: "); 
		 obj.num2 = sc.nextInt();
		 

		// calling/invoking the method
		
		 System.out.println(obj.add()); 
		 System.out.println(obj.sub());
		 
		int res = obj.add();
		int res1 = obj.sub();
		System.out.println("Addition value is :" + res);
		System.out.println("Sub value is :" + res1);

		// To call static and method by using class name
		// static variables and methods belongs to same class means we can call directly
		// without class name like below examples
		
		  num3=10; num4=20; mul();
		 

		Calculator.num3 = 10;
		Calculator.num4 = 20;
		Calculator.mul();

		// for division operation
		obj.div(10, 5);

		// or another way to call variables
		System.out.println("Enter the 1 value of division : ");
		int c = sc.nextInt();
		System.out.println("Enter the 2 value of division : ");
		int d = sc.nextInt();
		obj.div(c, d);
		
	}
}
