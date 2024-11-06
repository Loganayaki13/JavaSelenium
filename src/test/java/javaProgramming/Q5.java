package javaProgramming;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Mark  : ");

		int mark = input.nextInt();
		if (mark == 100) {
			System.out.println("Grade: S");
		} else if (mark >= 90 && mark <= 99) {
			System.out.println("Grade: A");
		} else if (mark >= 80 && mark <= 89) {
			System.out.println("Grade: B");
		} else if (mark >= 70 && mark <= 79) {
			System.out.println("Grade: C");
		} else if (mark >= 60 && mark <= 69) {
			System.out.println("Grade: D");
		} else if (mark >= 50 && mark <= 59) {
			System.out.println("Grade: E");
		} else {
			System.out.println("Grade: F");
		}

	}

}
