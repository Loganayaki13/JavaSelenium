package javaIntro;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num = input.nextInt();

		// checking the num is even or not
		if (num % 2 == 0) {
			System.out.println(num + " is an even number");

		}

	}
}
