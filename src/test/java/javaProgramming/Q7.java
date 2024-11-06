package javaProgramming;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		if (a > b && a > c) {
			System.out.println("a is grater than b & c");
		} else if (b > c) {
			System.out.println("b is grater than a & c");
		} else {
			System.out.println("c is grater than a & b");
		}
	}

}
