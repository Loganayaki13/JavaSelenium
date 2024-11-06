package javaIntro;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two numbers :");
		int a = input.nextInt();
		int b = input.nextInt();
		int c;
		System.out.println("Before swapping : a=" + a + " b=" + b);

		// swapping
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping : a=" + a + " b=" + b);
	}

}
