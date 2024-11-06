package javaIntro;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number  :");
		int a = input.nextInt(), num = 1;
		for (int i = 2; i < a; i++) {
			if (a % i != 0) {
			}

			else {
				num = 0;
				System.out.println(a + "Not a prime");
				break;
			}
		}
		if (num == 1) {
			System.out.println(a + " is a prime");
		}

	}

}
