package task4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the two values");

		int a = sc.nextInt(), b = sc.nextInt();
	
		System.out.println("Before swapping : a= " + a + " b=" + b);

		// swapping
		
		a = b;
		b = a;

		System.out.println("Before swapping : a= " + a + " b=" + b);

	}

}
