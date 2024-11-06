package javaIntro;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values :");
		int a = input.nextInt(), b = input.nextInt(), c = input.nextInt(), d = input.nextInt();
		int ab = a + b;
		int cd = c + d;

		System.out.println("Addition of a + b : " + ab);
		System.out.println("Addition of c + d : " + cd);

		// checking conditions
		if (ab > cd) {
			System.out.println("sum of a & b is greater than c & d");
		}

	}

}
