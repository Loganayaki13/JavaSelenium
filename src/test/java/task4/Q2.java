package task4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println(a + "num is even");
		} else {
			System.out.println(a + " is not a even");
		}

	}
}
