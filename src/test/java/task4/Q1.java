package task4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the values");

		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		int ab = a + b;
		int cd = c + d;

		System.out.println("Addition of a + b: " + ab);
		System.out.println("Addition of c + d: " + cd);

		if (ab > cd) {
			System.out.println("sum of a & b is greater than sum of c & d");
		}
		else
		{
			System.out.println("sum of a & b is not greater than sum of c & d");
		}

	}

}
