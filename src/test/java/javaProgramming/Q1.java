package javaProgramming;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = input.nextLine(), reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);

		}
		if (s.equals(reverse)) {
			System.out.println(reverse + " is a palindrome");
		} else {
			System.out.println(reverse + " not a palindrome");
		}
	}

}
