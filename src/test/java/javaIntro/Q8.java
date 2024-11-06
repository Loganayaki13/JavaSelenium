package javaIntro;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word to print 10 times: ");
		String value = input.nextLine();
		System.out.println(" ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(value);
		}
	}

}
