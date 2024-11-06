package javaProgramming;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number  : ");

		int a = input.nextInt(), b = a;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (j == i || j == b) {
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}
			System.out.println("");
			b--;
		}

	}

}
